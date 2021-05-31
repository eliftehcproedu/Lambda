package lambda_tum._1_Lambda.Stream_Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream02Integer {
    /*
        Lambda = Functional Programming
        Normal Java = Structured Programming
        */
    // stream() :Elemanlari yukaridan asagiya dizer
    // filter() :Belli sartlara gore eleman secmemize yarar.Loop gibi her elemani birer birer alarak islem yapar
    // forEach yazdirir void dondurur
    // distinct() : tekrarsiz yazdirir
    // distinct() yerine gore isi daha hizli yapar en basta olursa direk tekrarsiz alir daha az veri ile is yaparak hizlanir
    // map(): verileri update eder,degistirir(transformasyon-modifikasyon)
    // reduce() :Verileri tek bir ture indirger,methodlarla ilgili islemleri gerceklestirip tek bir deger doner (TekKareToplami gibi)
    // reduce un icinde kendi terminal islemimizi yazabiliriz veya bir method referansi cagirabiliriz
    // collect() :Stream in sonucunu bir listeye saklar,Collector interface leri yardimiyla gerceklestirilir.
    // sorted() : naturel order yazdirir
    // sorted(Comparator.reverseOrder()) ters sirali yazdirir
    // sorted(Comparator.comparing(t -> t.length())) :karsilastirip uzunluga gore siralar  =>  t->t.length()  (Lambda Fonksiyonu)
    // sorted(Comparator.comparing(String::length))   =>    String::length (Method Referansi)
    // allMatch () : belirtilen sartlari tum elemanlar sagliyorsa true dondurur,yoksa false
    // noneMatch () : belirtilen sartlari tum elemanlar saglamiyorsa true dondurur,yoksa false
    // anyMatch () : herhangi bir sartin saglanip saglanmamasina bakar, sart bir defa saglaniyorsa true dondurur, hic sagmanmiyorsa false
    public static void main(String[] args) {
        /*
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
         */
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,9,13,4,9,2,4,12,15));
        tekKareYazdir(list);
        System.out.println();
        System.out.print("toplam :" + tekKupToplami(list)); // toplam :7030

    }

    public static void tekKareYazdir(List<Integer> l) {

        l.stream().filter(Stream01Integer::tekMi).map(t->t*t).forEach(Stream01Integer::yazdir); //81 169 81 225
        //Lambda Expression kullanabilirsiniz ama daha guzeli mumkunse "Method Reference" kullanin
        //Method Reference ==> Class Ismi :: Method Ismi
        System.out.println();
        //distinct() : tekrarsiz yazdirir
        //map(): verileri update eder,degistirir(transformasyon-modifikasyon)
        l.stream().filter(Stream01Integer::tekMi). distinct().map(t->t*t).forEach(Stream01Integer::yazdir); //81 169 225
        System.out.println();
        //distinct() yerine gore isi daha hizli yapar en basta olursa direk tekrarsiz alir daha az veri ile is yaparak hizlanir
        l.stream(). distinct().filter(Stream01Integer::tekMi).map(t->t*t).forEach(Stream01Integer::yazdir); //81 169 225

        }
       // reduce() :Verileri tek bir ture indirger,methodlarla ilgili islemleri gerceklestirip tek bir deger doner (TekKareToplami gibi)
       //reduce un icinde kendi terminal islemimizi yazabiliriz veya bir method referansi cagirabiliriz
    public static int tekKupToplami(List<Integer> l) {
           return l.stream().filter(Stream01Integer::tekMi).map(x -> x * x * x).reduce(0, (x, y) -> (x + y));
           //x=0, y=729  //x=729 y = 2197 her seferinde bir sonrakini ustune topluyor o yuzden 2 degisken var (x,y)

           //asagidaki sekillerde de yazilabilir
           //return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(Math::addExact);
           //return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(0,Integer:: sum);

       }


}
