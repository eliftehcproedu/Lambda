package lambda_tum._3_Lambda;


import java.util.Arrays;

import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
l.stream().filter(Methods::EbasliyorMu).forEach(System.out::println);

    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim

    //S2: Stringleri uzunluklarina gore siralayip yaziniz

    //S3: E ILE Baslayanlari yazdiralim

}
