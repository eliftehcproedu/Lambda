package lambda_tum._1_Lambda.Stream_Ornekler;

import java.util.ArrayList;
import java.util.List;
// Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanılabilir.
// Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
// Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
// Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
// Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
// foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür.
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.
public class Stream01Integer {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);
        System.out.println("==== TEK SAYILAR ======");
        rakamlar.stream().filter(t->t%2 != 0).forEach(x ->System.out.println(x));
        // forEach yazdirir void dondurur
        System.out.println("\n==== CİFT SAYILAR ======");
        rakamlar.stream().filter(t->t%2 == 0).forEach(System.out::println); //Intelij method
        rakamlar.stream().filter(t->t%2 == 0).forEach(Stream01Integer::yazdir); //bizim method
        rakamlar.stream().filter(Stream01Integer::tekMi).forEach(Stream01Integer::yazdir); //bizim method
        System.out.println("\n==========CİFT SAYILAR(Method)================");
        ciftleriYazdir(rakamlar);
    }

    public static void ciftleriYazdir (List<Integer>list) {
        list.stream().filter(x->x%2 == 0).forEach(x ->System.out.println(x));
        list.stream().filter(Stream01Integer::ciftMi).forEach(Stream01Integer::yazdir);
    }

    public static boolean tekMi(Integer x) {
        return x% 2 !=0;
    }

    public static boolean ciftMi(Integer x) {
        return x% 2 ==0;
    }

    public static void yazdir(int x){
        System.out.print(x +" ");
    }
}
