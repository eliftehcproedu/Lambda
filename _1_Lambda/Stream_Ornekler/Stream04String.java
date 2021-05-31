package lambda_tum._1_Lambda.Stream_Ornekler;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Stream04String {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Christ");
        aIleBaslayanlar(liste);
        //Ali
        //Amanda
        //Alberto
        System.out.println("******buyukHarfeCevir******");
        buyukHarfeCevir(liste);
        System.out.println("******uzunlugaGoreSiralaKucult******");
        uzunlugaGoreSiralaKucult(liste);
        System.out.println("******uzunlugaGoreYazdir*********");
        uzunlugaGoreYazdir(liste, 5);
        System.out.println("*********************************");
        System.out.println("Tum Elemanlar Belirtilen Uzunluktan Kucuk Mu :" + uzunlukKucukMu(liste, 9));
        System.out.println("Baslayan Harf Yok Mu :" + baslamayanHarfVarMi(liste, "B"));
        System.out.println("Herhangi Biten harf Var Mi :" + herhangiBitenVarMi(liste, "r"));
        System.out.println("****aIleOYazdir*****");
        aIleOYazdir(liste);
        System.out.println("********listeleYazdir*********");
        listeleYazdir(liste);
        System.out.println("\n*******yazdir******");
        yazdir(liste);
    }

    // listedeki baş harfi A ile başlayan isimleri yazdıran metodu tanımlayalım..
    public static void aIleBaslayanlar(List<String> liste) {
        liste.stream().filter(h -> h.startsWith("A")).forEach(System.out::println);
    }

    public static void buyukHarfeCevir(List<String> liste) {
        liste.stream().map(h -> h.toUpperCase(Locale.ROOT)).forEach(System.out::println);
        liste.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    // listedeki tum elemanlari uzunluklarina gore siralayan ve kucuk harfe ceviren metodu tanımlayalım..

    public static void uzunlugaGoreSiralaKucult(List<String> liste) {
        liste.stream().    // uzun olduğu için noktalardan aşağı satıra aldık
                sorted(Comparator.comparing(t -> t.length())).   //uzunluga gore siralar
                map(t -> t.toLowerCase(Locale.ROOT)).
                forEach(System.out::println);

    }
    // Listedeki tüm elemanların uzunlukları belirtilen uzunluktan fazla ise bunlari siralayan
    // yazdıran metodu tanımlayalım..

    public static void uzunlugaGoreYazdir(List<String> liste, int uzunluk) {
        liste.stream().
                filter(t -> t.length() > 5).forEach(System.out::println);
    }

    // Listedeki tüm elemanların uzunlukları belirtilen uzunluktan kucuk mu diye kontrol eden
    // metodu tanımlayalım..
    // allMatch () : belirtilen sartlari tum elemanlar sagliyorsa true dondurur,yoksa false
    public static boolean uzunlukKucukMu(List<String> liste, int uzunluk) {
        return liste.stream().allMatch(t -> t.length() < uzunluk);

    }

    // Listedeki tum elemanlarin belirtilen harf ile baslayip baslamadigini kontrol eden method yaziniz.
    // noneMatch () : belirtilen sartlari tum elemanlar saglamiyorsa true dondurur,yoksa false
    public static boolean baslamayanHarfVarMi(List<String> liste, String harf) {
        return liste.stream().noneMatch(t -> t.startsWith(harf));
        //return liste.stream().allMatch(x->!x.startsWith("A"));

        // A harfi ile baslamayanlari yazdir dersem kullanabilecegim method
        // liste.stream().filter(x->!x.startsWith("A")).forEach(x-> System.out.print(x + " "));
    }

    // Listedeki herhangi bir eleman belirtilen bir harf ile bitiyor mu diye kontrol eden method yaziniz.
    // anyMatch () : herhangi bir sartin saglanip saglanmamasina bakar,
    // sart bir defa saglaniyorsa true dondurur, hic sagmanmiyorsa false
    public static boolean herhangiBitenVarMi(List<String> liste, String harf) {
        return liste.stream().anyMatch(t -> t.endsWith(harf));
    }

    //Listedeki hangi elemanlar A ile baslar o ile biter, bunu kontrol eden method yaziniz.
    public static void aIleOYazdir(List<String> liste) {
        liste.stream().
                filter(x -> x.startsWith("A") && x.endsWith("o")).
                forEach(System.out::println);
    }
    //  ÖRNEK24: Aşağıdaki formata göre listedeki her bir elemanın uzunluğunu yazdıran metodu yazınız.
    //  Ali: 3        Mark: 4       Amanda: 6     vb.
    public static void listeleYazdir(List<String> liste) {
    liste.stream().
    sorted(Comparator.comparing(String::length)).//String::length =>t->t.length()
    map(t->t+": "+t.length() + "\t").forEach(System.out::print);
}
public static void yazdir (List<String>liste) {
    liste.stream().
         map(String::toLowerCase).
            forEach(System.out::println);
}

  }


