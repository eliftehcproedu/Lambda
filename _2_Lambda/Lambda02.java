package lambda_tum._2_Lambda;
import java.util.*;
public class Lambda02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		kareCiftFunctional(list);
		
		System.out.println();
		kupBirFazlaTekFunctional(list);
		
		System.out.println();
		kareKokCiftFunctional(list);
		
		System.out.println();
		maxElFunctional(list);

	}
	
	// Cift sayi olan elemanlarin karesini ayni satirda aralarina bosluk birakarak console'a yazdirin
	public static void kareCiftFunctional(List<Integer> list) {		
		list.stream().filter(Lambda01::isCift).map(t-> t*t).forEach(Lambda01::printEl);
	}
	
	// Tek sayi olan elemanlarin kupunun 1 fazlasini ayni satirda aralarina bosluk birakarak console'a yazdirin
	public static void kupBirFazlaTekFunctional(List<Integer> list) {
		list.stream().filter(t-> t%2==1).map(t-> t*t*t+1).forEach(Lambda01::printEl);
	}
	
	// Cift sayi olan elemanlarin kare kokunu console'a yazdiriniz
	public static void kareKokCiftFunctional(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
	}

	//En buyuk elemani console'a yazdirin
	public static void maxElFunctional(List<Integer> list) {
		Optional<Integer> max = list.stream().reduce(Math::max);
		System.out.println("Max deger:" + max);
		
	}
	
}
