package lambda_tum._1_Lambda.Stream_Porje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Ogrenci> ogrListesi = new ArrayList<>();

    public static void main(String[] args) {

        testOgrenciOlustur();
        ismeGoreListele("Ahmet");
        System.out.println();
        ismeGoreListele("ayşe");
        System.out.println();
        ismeGoreListele("john");




    }

    private static void ismeGoreListele(String isim){
        ogrListesi.stream().filter(t->t.getAd().equalsIgnoreCase(isim)).forEach(System.out::println);








    }
    private static void testOgrenciOlustur(){
        //Ogrenci ogr1 =new Ogrenci("Ahmet", "Can", 30, 88.4, "Erkek");

        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Can", 21, 82.3, "kadın"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Yılmaz", 40, 45, "kadın"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "erkek"));



    }
}
