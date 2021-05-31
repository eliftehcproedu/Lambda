package lambda_tum._1_Lambda.Lambda_;

import java.util.Arrays;
import java.util.List;
/*
File > Settings > Keymap > Main Menu > Run
Bu yolu izleyerek intellij'de run icin kendi kisayolunuzu ekleyebilirsiniz.
Kendime Not : Ctrl R yaptim
 */
// Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanilabilir.
// Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
// Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
// Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
// Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
// foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür.
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.
public class Lambda01_Kurallar {

    public static void main(String[] args) {
        // forEach() bir collection nin iterasyonu icin HOF kullanilir
        // Parametre olarak bir lambda fonksiyonu olabilir

        //Dizinin Elemanlarini yazdiralim
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(x -> System.out.println(x));
        System.out.println("========================");
        //listenin elemanlarını 2 arttıralım
        list.forEach((t) -> System.out.print(t + 2 + " ")); //3 4 5 6 7


        System.out.println("\nEger satır sayisi 1'den fazla ise {} kullanmaliyiz...");
        list.forEach(t -> {
            int miktar = 2;
            System.out.print(t + miktar + " ");  //3 4 5 6 7
        });

        System.out.println("\nVeri tipi kullanilirsa Explicit");
        list.forEach((Integer x) -> System.out.print(x * 2 + " ")); //2 4 6 8 10

        System.out.println("\nBir diş degişken kullanalim");
        int deger = 6;
        list.forEach(t -> System.out.print(t + deger + " ")); //7 8 9 10 11

        //Method referansi =====> Class adi :: Method adi
        System.out.println("\nMethod referansi kullanimi");
        list.forEach(System.out::print); //12345
        System.out.println();
        list.forEach(Lambda01_Kurallar::yazdir);
        }

        public static void yazdir ( int x){
            System.out.print(x + " ");  //1 2 3 4 5
    }

}
