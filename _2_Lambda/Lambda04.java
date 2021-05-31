package lambda_tum._2_Lambda;
import java.util.*;
public class Lambda04 {
public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Jackson");
        list.add("Jackson");
        list.add("Tucker");
        list.add("Christ");
        
        buyukHarfSiraliTekrarsiz1(list);
        System.out.println("=============");
        buyukHarfSiraliTekrarsiz2(list);
        System.out.println("=============");
        charSayisiTersSiraliTekrarsiz(list);
        System.out.println();
        System.out.println("=============");
        charSayisinaGoreSirala(list);
        System.out.println("=============");
        sonHarfReverse(list);

	}
	//List elemanlarinin tamamini buyuk harfli olarak, alfabetik sirada ve tekrarli elemanlari sadece bir kere console'a yaz
	//Lambda Expression
	 public static void buyukHarfSiraliTekrarsiz1(List<String> list) {
		 list.
		 stream().
		 map(t-> t.toUpperCase()).
		 sorted().distinct().
		 forEach(System.out::println);
	 }
	
	//Method Reference
	public static void buyukHarfSiraliTekrarsiz2(List<String> list) {
		list.
		stream().
		map(String::toUpperCase).
		sorted().
		distinct().
		forEach(System.out::println);
	}
	
	//List elemanlarinin tamaminin character sayisini, ters sirali olarak tekrarli elemanlari sadece bir kere olacak sekilde console'a yaz
	public static void charSayisiTersSiraliTekrarsiz(List<String> list) {
		list.
		stream().
		map(t-> t.length()).
		sorted(Comparator.reverseOrder()).
		distinct().
		forEach(Lambda01::printEl);
	}
	
	//List elemanlarinin tamamini character sayisina gore kucukten buyuge console'a yazdiriniz
	public static void charSayisinaGoreSirala(List<String> list) {
		list.
		stream().
		sorted(Comparator.comparing(t-> t.toString().length())).
		forEach(System.out::println);
	}
	
	//List elemanlarinin tamamini son harflerine gore reverse order olarak console'a yazdiriniz
	public static void sonHarfReverse(List<String> list) {
		list.
		stream().
		sorted(Comparator.comparing(t-> t.toString().charAt(t.toString().length()-1)).reversed()).
		forEach(System.out::println);
	} 



}
