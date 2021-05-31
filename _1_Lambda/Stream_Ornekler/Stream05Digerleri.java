package lambda_tum._1_Lambda.Stream_Ornekler;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.*;

public class Stream05Digerleri {
    /*
          Collection'larimizi stream method;u ile Stream'e cevirmeyi ogrendik.
          Collection : List,Map,HashMap vb..
          Stream'e cevirdikten sonra Stream API kullanarak pipeLine'a sokuyorduk.
          IntStream : Integer seklinde Stream olusturabiliriz.
          LongStream, DoubleStream
          Bunlarin ne artisi var ? Sayisal degerlerle islem yapacaksak isleri kolaylastiriyor.
          Biz istersek Integer, Double, Long tipinde Stream'ler olusturabiliyoruz.
         */

    public static void main(String[] args) {

        System.out.println("TOPLAM: " + topla(4));  //TOPLAM: 10
        System.out.println("******topla1********");
        topla1(4);
        System.out.println("******tekTopla******");
        tekTopla (1,7);
        System.out.println("******faktoriyel******");
        System.out.println("IntStream ile faktoriyel (int primitive): " + faktoriyel(10)); //3628800
        System.out.println("LongStream ile faktoriyel): " + faktoriyel1(20));  //2432902008176640000
        System.out.println("DoubleStream ile faktoriyel): " + faktoriyel2(34));  //2.9523279903960412E38
        System.out.println("Notlari 50 den büyük olanlar : " + doubleDiziCevirList()); // [88.5, 52.3, 88.9, 100.0, 99.6]
    }
    // 1'den belirtilen değere kadar olan tamsayıları
    // toplayan ve sonucu döndüren metodu yazınız.

    public static int topla(int deger){

        return IntStream.range(1,deger+1).sum();//1 dahil deger+1 dahil degil
    }
    public static void topla1 (int deger){

        IntStream.rangeClosed(1,deger).forEach(System.out::println); //iki sinir da dahil olur
    }
    public static void tekTopla (int alt,int ust){

        IntStream.rangeClosed(alt,ust).filter(x-> x% 2!=0).sum();
    }

    //Belirtilen sayinin faktoriyelini hesaplayan methodu yaziniz..

    public static Integer faktoriyel(int n){  //IntSream icin primitive data yazilmaz..N-primitive olmali (Wrapper)
      return IntStream.rangeClosed(1,n).reduce(1,(x,y)->x*y);
        //return IntStream.iterate(1,t->t+1).limit(n).reduce(1,(x,y)->x*y); de olur
    }

    public static Long faktoriyel1(int n){  //Buyuk sayilar icin negatif sonuc veriyor, Long kullandik
        return LongStream.rangeClosed(1,n).reduce(1,(x, y)->x*y);
    }

    public static Double faktoriyel2(int n){  //peek ile aradaki degerler yazdirilir, biz su an kullanmayacagiz
        return DoubleStream.iterate(1.0,x->x+1).limit(n).reduce(1,(x, y)->x*y);
        //rangeClose(); double da yok,ondalik sayilar arasinda sonsuz sayi var ..bu yuzden iterate kullandik,
        //Integer, Double, Long tipinde Stream'ler icin iterate kullanilir,hepsine uyar
        //ancak iterate methodu limit ile kullanilir, iterate(1.0,x->x+1).limit(n) 1 den basla 1'er arttirark n'e kadar git
    }
    // Bir double diziyi (notlar) Stream nesnesine dönüştürerek bu dizi içerisinde bulunan
    // sayıların 50 den büyük olanlarını ayrı bir listeye kaydererek yazdıran metodu tanımlayınız

    public static List<Double> doubleDiziCevirList(){

        //Integer[] x={1,2,23};  Stream<Integer> y =Stream.of(x);  bir Integer array Stream de kullanilacak sekle gelir
        //Stream.of() methodu ile Stream ler calisabilir hale gelir
         Double [] notlar = {88.5, 52.3, 88.9, 100.0, 99.6, 42.0, 10.0};
        Stream<Double> streamNotlar = Stream.of(notlar);
        return streamNotlar.filter(t->t>50.0).collect(Collectors.toList());

    }







}