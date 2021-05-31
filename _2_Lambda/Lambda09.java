package lambda_tum._2_Lambda;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasini okuyunuz.(Console'a yazdiriniz)
		Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		forEach(System.out::println);

		System.out.println("============");
		
		//FileForLambda dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
		Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(String::toUpperCase).
		forEach(System.out::println);
	
		//FileForLAmbda dosyasindaki ilk satirikucuk harflerle okuyunuz
		//1.Yol
		Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(String::toLowerCase).
		limit(1).
		forEach(System.out::println);
		
		System.out.println(Files.
				lines(Paths.
						get("src\\extra\\FileForLambda")).
				findFirst().
				map(String::toLowerCase)
				);
		//FileForLambda dosyasinda "Lambda" kelimesinin kac satirda gectiginiz ekrana yazdiran programi yaziniz
		System.out.println(Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		filter(t-> t.
				contains("Lambda")).
		count());
		
		
		
		//FileForLambda dosyasinda tum farkli kelimeleri bir listin icinde ekrana yazdiriniz.
		System.out.println(Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(t->t.
				split(" ")).
		flatMap(Arrays::stream).
		distinct().
		collect(Collectors.toList()));
		
		//FileForLambda dosyasindaki tum kelimeleri natural order listin icinde ekrana yazdiriniz.
		Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(t->t.
				toLowerCase().
				split(" ")).
		flatMap(Arrays::stream).
		sorted().
		forEach(System.out::println);
		
				//FileForLambda dosyasinda "Lambda" kelimesinin kac kere gectigini buyuk harf kucuk harf onemsemeden
				//ekrana yazdiran programi yaziniz.
		System.out.println(Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(t->t.
				toLowerCase().
				split(" ")).
		flatMap(Arrays::stream).
		filter(t-> t.
						equals("lambda")).
				count());
		
		//FileForLambda dosyasinda "m" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
		System.out.println(Files.
				lines(Paths.
						get("src\\extra\\FileForLambda")).
				map(t->t.
						split("")).
				flatMap(Arrays::stream).
				filter(t-> t.
						equals("m")).
						count());	
		
		//FileForLambda dosyasinda icinde "m" harfi gecen kelimeleri ekrana yazdiran programi yaziniz
		Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(t->t.
				split(" ")).
		flatMap(Arrays::stream).
		filter(t-> t.
				contains("m")).
		forEach(System.out::println);
		
		//FileForLambda dosyasinda kac harf kullanildiginigosteren programi yaziniz
		System.out.println(Files.
		lines(Paths.
				get("src\\extra\\FileForLambda")).
		map(t->t.
				replaceAll("\\W", "").
				replaceAll("\\d", "").
				split("")).
		flatMap(Arrays::stream).
		count());
		
		//FileForLambda dosyasinda kac farkli kelime kullanildigini gosteren programi yazdirin
		System.out.println(Files.
				lines(Paths.
						get("src\\extra\\FileForLambda")).
				map(t->t.
						replaceAll("[.!?,\\-]", "").
						split(" ")).
				flatMap(Arrays::stream).
				distinct().
				count());
		
		
		
		
		//
	}

}
