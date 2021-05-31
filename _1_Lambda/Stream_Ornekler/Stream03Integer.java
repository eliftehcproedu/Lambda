package lambda_tum._1_Lambda.Stream_Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03Integer {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,9,13,4,9,2,4,-12,12,-1,15,-15,500));
        System.out.println("En buyuk deger :" + buyukBul(list)); //En buyuk deger :500
        System.out.println("En buyuk deger(Math) :" + buyukBul1(list)); //En buyuk deger(Math) :500500
        System.out.println("En buyuk deger(Sorted) :" + buyukBul2(list)); //En buyuk deger(Sorted) :500
        System.out.println("En kucuk deger :" + kucukBul(list)); //En kucuk deger :-15
        System.out.println("Carpim degeri :" + carpimBul(list)); //Carpim degeri :414353408
       // System.out.println("Kac tane 9 var :" + dokuzSay(list)); //Kac tane 9 var :2
        System.out.println("Kac tane 9 var :" + dokuzSay(list)); //Kac tane 9 var :2
        System.out.println("Negatif sayilar listesi :" +negatifSayiListesi(list)); //Negatif sayilar listesi :[-12, -1, -15]

        negatifSayilariYazdir(list);
        System.out.println();
        System.out.println("Tek sayilarin sirali karelerinin listesi :" +tekKareSiraliListele(list));
        //[1, 81, 169, 225]
      }

    private static void negatifSayilariYazdir(List<Integer> l) {
        l.stream().filter(x -> x<0).forEach(System.out::print); //-12-1-15
    }

    public static int buyukBul(List<Integer> l) {
        return l.stream().reduce(0,(x,y) -> x>y ? x:y);
    }

    public static int buyukBul1(List<Integer> l) {
        return l.stream().reduce(0, Math :: max);
    }

    public static int buyukBul2(List<Integer> l) {
        return l.stream().sorted().reduce(0, (x,y)->y);
    }
    public static int kucukBul (List<Integer> l) {
        return l.stream().reduce(0, (x, y) -> x < y ? x : y);
    }
    public static int carpimBul (List<Integer> l) {
        return l.stream().reduce(1, (x, y) -> x*y);
    }

    //Liste icerisinde kac tane 9 sayisi bulunmaktadir? Bir methodla yazin.
    public static int dokuzSay (List<Integer> l) {//count sadece long ifade kabul ediyor,(int) yazarak casting yaptik
        //return (int) l.stream().filter(x-> x==9).count();
        return (int) l.stream().filter(x->x==9).reduce(0,(x,y)->++x);
    }

    //Listedei negatif sayilari ayri bir liste olarak donduren metodu yazalim.
    public static List<Integer> negatifSayiListesi(List<Integer> l){
        return l.stream().filter(x -> x<0).collect(Collectors.toList());

    }
    //Listedeki tek elemanlarin karelerini sirali ve tekrarsiz bir sekilde listeye kaydeden metodu yaziniz
    //filter .distinct.map.sorted.collect olabilir

    public static List<Integer> tekKareSiraliListele(List<Integer>liste) {
        return liste.
                stream().
                distinct().
                filter(Stream01Integer::tekMi).
                map(x-> (int) Math.pow(x,2)).  //x in karesi //map(x-> x*x).
                distinct().
                sorted(). //sorted(). : naturel order
                collect(Collectors.toList());
        //math operatoru pow i double aliyor,bizim listemiz Integer o yuzden sonucu int yaptik
        //sorted(). : naturel order yazdirir
        //sorted(Comparator.reverseOrder()). ters sirali yazdirir
    }




}
