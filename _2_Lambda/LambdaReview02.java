package lambda_tum._2_Lambda;
import java.util.ArrayList;
import java.util.List;
public class LambdaReview02 {

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
		
        //List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
        System.out.println(list.
        		stream().
        		filter(t-> t.
        				contains("a") && t.
        				contains("n")).
        		mapToInt(t-> t.
        				length()).
        		sum());
        
        //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
        list.
        stream().
        filter(t-> t.
        		toLowerCase().
        		charAt(0)<t.
        		charAt(t.length()-1)).
        map(t-> t).
        forEach(System.out::println);
	}

}
