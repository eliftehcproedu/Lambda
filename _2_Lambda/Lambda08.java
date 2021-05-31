package lambda_tum._2_Lambda;
import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class Lambda08 {

	public static void main(String[] args) {

		System.out.println(sum1(20));
		System.out.println(sum2(20));
		System.out.println(sum3(20));
		System.out.println(sumCift(20));
		System.out.println(sumIlkXCift1(20));
		System.out.println(sumIlkXCift2(20));
		System.out.println(sumIlkXTek1(20));
		System.out.println(sumIlkXTek2(20));
		kuvvet2Yazdir(5);
		System.out.println();
		istenenSayininKuvvetiniYazdir(3, 6);
		System.out.println();
		System.out.println(istenenSayininIstenenKuvvet(3, 6));
		System.out.println();
		System.out.println(istenenSayininFaktoriyel(5));
		System.out.println();
		System.out.println(factorialBigInteger(50));
	}

	// 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
	// Structured Programming
	public static int sum1(int x) {
		int sum = 0;
			for(int i = 0; i<=x; i++) {
				sum += i;
			}
			return sum;
	}

	// Functional Programming
	public static int sum2(int x) {
		return IntStream.
				range(0, x+1).
				sum();
	}

	public static int sum3(int x) {
		return IntStream.
				rangeClosed(1, x).
				sum();
	}

	// 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
	public static int sumCift(int x) {
		return IntStream.
				rangeClosed(0, x).
				filter(t -> t % 2 == 0).
				sum();
	}

	// Ilk x pozitif cift sayiyi toplayan program yaziniz
	// 1.yol:
	public static int sumIlkXCift1(int x) {
		return IntStream.
				rangeClosed(1, 2 * x).
				filter(Lambda01::isCift).
				sum();
	}

	// 2.Yol: Recommended
	public static int sumIlkXCift2(int x) {
		return IntStream.
				iterate(2, t -> t + 2).
				limit(x).
				sum();
	}

	// Ilk X pozitif tek tamsayiyi toplayan programi yaziniz
	// 1.Yol: Recommended
	public static int sumIlkXTek1(int x) {
		return IntStream.
				iterate(1, t -> t + 2).
				limit(x).
				sum();
	}

	// 2.Yol
	public static int sumIlkXTek2(int x) {
		return IntStream.
				rangeClosed(1, 2 * x - 1).
				filter(t -> t % 2 != 0).
				sum();
	}

	// 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz
	public static void kuvvet2Yazdir(int x) {
		IntStream.
		iterate(2, t -> t * 2).
		limit(x).
		forEach(Lambda01::printEl);
	}

	// Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz
	public static void istenenSayininKuvvetiniYazdir(int a, int x) {
		IntStream.
		iterate(a, t -> t * a).
		limit(x).
		forEach(Lambda01::printEl);
	}

	// Istenilen bir sayinin istenilen kuvvetini ekrana yazdiran programi yaziniz
	public static int istenenSayininIstenenKuvvet(int a, int x) {
		return IntStream.
				iterate(a, t -> t * a).
				limit(x).
				reduce(0, (m, n) -> n);
	}
	
	//Istenilen bir sayinin faktoriyeini hesaplayan programi yaziniz
	public static OptionalInt istenenSayininFaktoriyel(int a) {
		return IntStream.
				rangeClosed(1, a).
				reduce(Math::multiplyExact); //reduce(1, (m,n) ->m*n) olur
	}
	
	//Buyuk sayilarla calisabilmek..
	public static BigInteger factorialBigInteger(int a) {
		return IntStream.
				rangeClosed(1, a).
				mapToObj(BigInteger::valueOf).
				reduce(BigInteger.ONE, BigInteger::multiply);
	}

}
