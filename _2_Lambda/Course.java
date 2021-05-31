package lambda_tum._2_Lambda;

public class Course {

	private String Season;
	private String courseName;
	private int averageScore;
	private int numberOfStudents;

	public Course(String name, String courseName, int score, int numberOfStudents) {
		this.Season = name;
		this.courseName = courseName;
		this.averageScore = score;
		this.numberOfStudents = numberOfStudents;
	}

	public String getSeason() {
		return Season;
	}

	public void setSeason(String season) {
		Season = season;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String toString() {
		return Season + "/ " + courseName + "/ " + averageScore + "/ " + numberOfStudents;
	}
}
