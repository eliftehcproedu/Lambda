package lambda_tum._2_Lambda;
import java.util.stream.IntStream;
public class LambdaReview03 {
	public static void main(String[] args) {
		
		// Ilk 10 7 ile bolunebilen tamsayilarin toplamini ekrana yazdiriniz.
		//1.Yol
		System.out.println(IntStream.
				rangeClosed(1, 70).
				filter(t->t%7==0).
				sum());
		
		//2.Yol
		System.out.println(IntStream.
				iterate(7, t-> t+7).
				limit(10).
				sum());
	}
}
