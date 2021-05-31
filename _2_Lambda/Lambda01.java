package lambda_tum._2_Lambda;
import java.util.*;
public class Lambda01 {
	
	/*
	 	1) Lambda "Functional Programming"
	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi 
	 	ve hatasiz code yazma acilarindan cok faydalidir.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir.
	 	
	 */

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
		
		printElStructured(list);
		
		System.out.println();
		printElFunctional1(list);
		
		System.out.println();
		printElFunctional2(list);
		
		System.out.println();
		printElFunctional3(list);
		
		System.out.println();
		System.out.println("==================");
		
		System.out.println();
		printCiftElStructured(list);
		
		System.out.println();
		printCiftElFunctional(list);
		
		System.out.println();
		printCiftElFunctional2(list);
		
		System.out.println();
		printKucukOnTekFunctional(list);
		
		System.out.println();
		printOndanKucukCiftFunctional(list);
	}
	
	// "Structured Programming" ile List elemanlarinin tamamini ayni satirda aralarina bosluk birakarak console'a yazdiriniz.
	public static void printElStructured(List<Integer> list) {
		
		for(Integer w:list) {
			System.out.print(w + " ");
		}
	}
	// "Functional Programming" ile List elemanlarinin tamamini ayni satirda aralarina bosluk birakarak console'a yazdiriniz.
	// Lambda Expression
	public static void printElFunctional1(List<Integer> list) {
		list.stream().forEach(t->System.out.print(t + " "));
		
	}
	// "Method Reference" kendi olusturdugum method ile..
	// "Method Reference" ==> Class Ismi :: Method Ismi
	public static void printEl(int t) {
		System.out.print(t + " ");
	}
	public static void printElFunctional2(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl);
		
	}
	
	//Method Reference Java'nin olusturdugu methodlar ile...
	public static void printElFunctional3(List<Integer> list) {
		list.stream().forEach(System.out::print);
		
	}
	//"Structured Programming" ile cift sayi olan list elemanlarinin tamamini ayni satirda
	//aralarina bosluk birakarak console'a yazdiriniz.
	public static void printCiftElStructured(List<Integer> list) {
		for(Integer w:list) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
	}
	// "Functional Programming" ile cift sayi olan list elemanlarinin tamamini ayni satirda
	// aralarina bosluk birakarak console'a yazdiriniz
	// Lambda Expression
	public static void printCiftElFunctional(List<Integer> list) {
		list.stream().filter(t-> t%2==0).forEach(t->System.out.print(t + " "));
	}
	
	//Method Reference kendi methodum ile
	public static boolean isCift(int t) {
		return t%2==0;
	}
	
	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).forEach(Lambda01::printEl);
	}
	
	// "Functional Programming" ile 10'dan kucuk ve tek sayi olan list elemanlarinin
	// tamamini ayni satirda, aralarina bosluk birakarak console'a yazdiriniz.
	public static void printKucukOnTekFunctional(List<Integer> list) {
		list.stream().filter(t-> t%2==1 && t<10).forEach(Lambda01::printEl);
	}
	
	// "Functional Programming" ile 10'dan kucuk veya cift sayi olan list elemanlarinin tamamini ayni satirda
	// aralarina bosluk birakarak console'a yazdiriniz.
	public static void printOndanKucukCiftFunctional(List<Integer> list) {
		list.stream().filter(t-> t<10 || t%2==0).forEach(Lambda01::printEl);
	}
}
