package lambda_tum._2_Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
public class Lambda07 {

	public static void main(String[] args) {
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);

		System.out.println(ogrSayiAvgScr93Bir(courseList));
		System.out.println(ogrSayiAvgScr93Iki(courseList));
		System.out.println(avgScrStd140(courseList));
		System.out.println(dayKursSayi(courseList));
		System.out.println(maxAvgScr130(courseList));
		System.out.println(minAvgScrOgrSay150(courseList));
	}
	
	//Average Score'lari 93'den fazla olan kurslarin ogrenci sayilari toplamini bulunuz
	public static int ogrSayiAvgScr93Bir(List<Course> courseList) {
		return courseList.
				stream().
				filter(t-> t.
						getAverageScore()>93).
				map(t-> t.getNumberOfStudents()).
				reduce(0, Integer::sum);
	}
	
	public static int ogrSayiAvgScr93Iki(List<Course> courseList) {
		return courseList.
				stream().
				filter(t-> t.
						getAverageScore()>93).
				mapToInt(t-> t.getNumberOfStudents()).sum();
				
	}
	
	
	//Ogrenci sayi'lari 140 dan fazla olan kurslarin average score'unu bulunuz.
	public static OptionalDouble avgScrStd140(List<Course> courseList) {
		return courseList.
		stream().
		filter(t-> t.
				getNumberOfStudents()>140).
		mapToDouble(t-> t.
				getAverageScore()).
		average();
		
	}

	//Day time kurslarinin sayisini bulan bir program yaziniz.
	public static long dayKursSayi(List<Course> courseList) {
		return courseList.
				stream().
				filter(t-> t.
						getCourseName().
						contains("Day")).
				count();
	}
	
	// Ogrenci sayilari 130'dan fazla olan kurslarin maximum average score'unu bulunuz
	public static OptionalDouble maxAvgScr130(List<Course> courseList) {
		return courseList.
				stream()
				.filter(t-> t.
						getNumberOfStudents()>130).
				mapToDouble(Course::getAverageScore).
				max();
	}
	
	//Ogrenci sayilari 150'dan az olan kurslarin minimum average score'unu bulunuz.
	public static OptionalDouble minAvgScrOgrSay150(List<Course> courseList) {
		return courseList.
		stream().
		filter(t-> t.
				getNumberOfStudents()<150).
		mapToDouble(Course::getAverageScore).
		min();
	}
}
