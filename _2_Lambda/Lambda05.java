package lambda_tum._2_Lambda;
import java.util.*;
import java.util.stream.Stream;
public class Lambda05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        ciftLengthSqrTekrarsizReverse(list);
        System.out.println();
        harfSayisi7DenFazla(list);
        ilkHarfX(list);
        enAzBirR(list);
        harfSayisiReverseIlk(list);
        harfSayisiReverseIlk2(list);
        sonHarfSortSonEleman(list);
        ilkHaricSortedEleman(list);

	}
	//Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
	//yazdiran bir program yaziniz.
	public static void ciftLengthSqrTekrarsizReverse(List<String> list) {
		list.
		stream().
		map(t->t.length()*t.length()).
		filter(Lambda01::isCift).
		distinct().
		sorted(Comparator.reverseOrder()).
		forEach(Lambda01::printEl);
	}

	//Tum isimlerin 7 veya harfden az harf icerdigini gosteren programi yaziniz
	public static void harfSayisi7DenFazla(List<String>list) {
		boolean result = list.stream().allMatch(t-> t.length()<=7);
			if(result) {
				System.out.println("Tum elemanlar 7 veya 7 den az harf icerir");
			}else {
				System.out.println("En az bir eleman 7 den fazla harf icerir");
			}
	}
	
	//Hic bir elemanin "X" ile basmalamadigini gosteren programi yaziniz.
	public static void ilkHarfX(List<String> list) {
		boolean result = list.stream().noneMatch(t-> t.startsWith("X"));
			if(result) {
				System.out.println("Hic bir eleman 'X' ile baslamiyor");
			}else {
				System.out.println("En az bir eleman 'X' ile basliyor");
			}
	}
		
	//En az 1 elemanin 'R' ile bittigini gosteren programi yaziniz
	public static void enAzBirR(List<String> list) {
		boolean result = list.stream().anyMatch(t-> t.endsWith("R"));
			if(result) {
				System.out.println("En az bir eleman 'R' ile bitiyor");
			}else {
				System.out.println("Hic bir eleman 'R' ile bitmiyor");
			}
	}

	//Isimleri character sayilarina gore buyukten kucuge dizdikten sonrailk ismi ekrana yazdiriniz
	public static void harfSayisiReverseIlk(List<String> list) {
		Optional<String> ilkIsim = list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
		System.out.println(ilkIsim);
	}
	public static void harfSayisiReverseIlk2(List<String> list) {
		Stream<String> ilkIsim = list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
		System.out.println(Arrays.toString(ilkIsim.toArray()));
	}
		
		//Isimleri son harflerine gore siraladiktan sonra son ismi ekrana yazdiriniz
		public static void sonHarfSortSonEleman(List<String>list) {
		Optional<String> sonIsim = list.
			stream().
				sorted(Comparator.
					comparing(t->t.toString().charAt(t.toString().length()-1)).
						reversed()).
			findFirst();
			System.out.println(sonIsim);
		}
			
		
		
		//Isimleri son harflerine gore siraladiktan sonra ilk isim haric digerlerini ekrana yazdiriniz
		public static void ilkHaricSortedEleman(List<String> list) {
			list.
				stream().
					sorted(Comparator.
							comparing(t->t.toString().charAt(t.toString().length()-1))).
			skip(1).
			forEach(System.out::println);
		}
}
