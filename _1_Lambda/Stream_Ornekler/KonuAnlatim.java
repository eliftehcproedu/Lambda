package lambda_tum._1_Lambda.Stream_Ornekler;

public class KonuAnlatim {

       /*
        Lambda = Functional Programming (Fonksiyonel)
        Normal Java = Structured Programming (Yapilandirilmis)

      -Stream; bir veri yapisi degildir ve bellekte yer tutmaz. Sadece, var olan veri yapilarini girdi olarak alir ve
        girdilerin veri yapisini degistirmeden isler.
      - Verilerin sirali islemlerden (pipeline) gecirilerek islenmesini ve istenilen sonuclarin elde edilmesini saglar.

      - Neden StreamAPI kullaniyoruz ? Streamapi icerisinde yazilmis hazir method'lar fonksiyonlari destekliyorlar.
      - Stream API icerisindeki method'lar Lambda ifadelerini desteklemektedir.
        Method'lar icerisinde fonksiyonel arayuzler kullandigi icin Lambda ifadelerini kullanmak mumkundur.
      - Dongu vb. islemleri kullanmak yerine hazir method'larin kullanimi sayesinde cok daha kisa ve anlasilir kod yazmak mumkundur.

     - Bir Stream hatti; bir kaynak, O'nu takip eden ve 0(sifir) veya daha fazla ara islem ve bir terminal(sinlandirici) islem icerir.
     - Stream Kaynagi : Collection, List, Set, File, Array vb.
     - Stream donduren Method'lar : Filter, map, sort, distinct, limit vb.
     - Terminal Islemleri : foreach, collect, reduce, min, max,  count gibi void veya stream dondurmeyen methodlardir.
     Terminal islemleri Stream'i kapatmak demektir, Stream'i kapatmazsak olmaz.

     *stream() :Elemanlari yukaridan asagiya dizer (selale)
      ==Stream pipeline(HAT) :Ara islemler ; terminal tarafindan tek tek cagirilarak calisir
            *filter() :Belli sartlara gore eleman secmemize yarar.Loop gibi her elemani birer birer alarak islem yapar
            filter basta olursa islemi hizlandirir
            *sorted() :naturel order yazdirir harf sirasi, kucukten buyuge sayilari dizer
            *distinct():tekrarsiz veri yazdirir
            distinct() yerine gore isi daha hizli yapar en basta olursa direk tekrarsiz alir daha az veri ile is yaparak hizlanir
            *limit() :istenilen veriye sinirlama koyar, limit(3) -> 3 den sonrasini alarak islem yap
            *findFirst() : istenen ilk veriyi bulur
            *skip() :istenen miktardaki veriyi atkayarak islem yapar,long deger dondurur. skip(5) -> ilk 5 elemani atla vs
            *map(): verileri update eder,degistirir(array ve collection vs)(transformasyon-modifikasyon)
            *flatMap() :Nested(icice) yapilari tek bir yapi haline getirir,birden fazla collection i birlestirir
             islemleri kolaylastirmak icin (destructuring)

     *sorted(Comparator.reverseOrder()) ters sirali yazdirir
     *sorted(Comparator.comparing(t -> t.length())) :karsilastirip uzunluga gore siralar  =>  t->t.length()  (Lambda Fonksiyonu)
     *sorted(Comparator.comparing(String::length))   =>    String::length (Method Referansi)

     *allMatch () : belirtilen sartlari tum elemanlar sagliyorsa true dondurur,yoksa false
     *noneMatch () : belirtilen sartlari tum elemanlar saglamiyorsa true dondurur,yoksa false
     *anyMatch () : herhangi bir sartin saglanip saglanmamasina bakar, sart bir defa saglaniyorsa true dondurur, hic saglanmiyorsa false

     ==Terminal islemler sadece bir kere kullanilir,bunlar:  forEach(), reduce(), collect(), max(), min(),count()
        *forEach() yazdirir void dondurur
        *reduce() :Verileri tek bir ture indirger,methodlarla ilgili islemleri gerceklestirip tek bir deger doner (TekKareToplami gibi)
        *reduce un icinde kendi terminal islemimizi yazabiliriz veya bir method referansi cagirabiliriz
        *collect() :Stream in sonucunu bir listeye saklar,Collector interface leri yardimiyla gerceklestirilir.
        *count() :sayac, long deger dondurur

       */

}