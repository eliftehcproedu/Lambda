package lambda_tum._2_Lambda;
public class Not {

    //Functional Programming" ile List elemanlarinin tamamini ayni satirda aralarina bosluk birakarak console'a yazdiriniz.
    // Lambda Expression
    //list.stream().forEach(t -> System.out.print(t + " "));
    //stream: şelale gibi diz...... t->Sout:listteki herbir elemanı (t) al yazdır
    //"Method Reference" kendi olusturdugum method ile..
    // "Method Reference" ==> Class Ismi :: Method Ismi
    // list.stream().forEach(Lambda01::printEl);
    //collect(Collectors.toList()===list gibi yazdırmak için kullanılır

    //filter(t-> t%2==0 && t<15)==> elemanlar içinde filtreleme yapar, örneğin çift ve 15 ten küçük sayılar
    //map: elemanları tek tek değiştirmek için...örneğin:elemanların karesini almak... map(t-> t*t)(4 elemanını=>16 yapar)
    //  map ile Math class ındaki metodları kullanabiliriz...map(Math::sqrt)==> burada elemanların karesini almışız
    //map(String::toUpperCase)==> String class ından metod çağırabiliriz...list imizin data type ının class ındaki metodları
    // kullanabiliriz.
    // reduce(); eleman sayısını azaltmak demek, tek sonuç istendiğinde kullanılır.
    // 1 den verilen sayıya kadar çarpılması istendiğinde int çarpım=1; yazıp for içinde çarpım=çarpım*sayı yaparak
    // çözdüğümüz soruyu ===IntStream.range(1,sayı+1).reduce(Math::multiplyExact); (1 den sayı ya kadar bütün sayıları çarp)
    // ya da ===IntStream.range(1,sayı+1).reduce(1, (m,n) ->m*n)...(m=1, n=2==>m=1*2
    //                                                              m=2, n=3==>m=2*3.....
    //                                                              .      .    .     ) şeklinde de çözebiliriz
    //reduce(Integer::min)==> Integer class ından metod çağırabiliriz (örneğin min sayı bulma metodu)
    // reduce(Math::max)==>(örneğin list in max elemanı istenirse kullanılır ve Math class ından metod çağırabiliriz)
    //bazen reduce CTE verir, üstüne tıklayınca list imizi optional yapar (örneğin max yoksa diye CTE verdiğinde Optional
    // yapınca düzeldi(cevapta Optional sayı olarak çıkar.)
    // reduce bize tek cevap vereceği için foreach ile yazdıramayız, komutlandırdığımız list i (list.stream().reduce...)
    // syso nun içine alıp yazdırabiliriz
    //  sorted(): list i natural order a göre sıralar.
    //sorted(Comparator.reverseOrder()):büyükten küçüğe sıralamak istersek, Comparator class ından reverseOrder() metoduyla
    //terse çevirip sorted() ile büyükten küçüğe sıralamış oluyoruz
    // sorted(Comparator.comparing(t-> t.length())):elemanları kendi istediğimiz bir duruma göre sıralamak istediğimizde
    //    örneğin burada elemanların length() ine göre sıralamışız
    //distinct(): list in elemanlarını tekrarsız yaz
    //allMatch(): bütün elemanlarda olmasını istediğimiz şeyleri yazarız sonuç boolean verir
    //örneğin String bir list için==> allMatch(t -> t.length() < 7)==elemanların hepsinin uzunluğu 7 den küçükse true,
    // biri bile değilse false

    //noneMatch():hiçbir elemanda olmasın istersek kullanırız, elemanların tümünde yoksa true,
    // bir tane elemanda bile varsa false
    //örneğin==>noneMatch(t-> t.startsWith("X"))==hiçbiri X ile başlamıyorsa true

    //anyMatch(): en az bir elemanda olmasını istediğimiz bir özellik varsa kullanırız,sonuç boolean dır
    // örneğin==>anyMatch(t-> t.endsWith("R"))== en az bir eleman R ile bitiyorsa true,yoksa false

    //findFirst():listedeki ilk elemanı verir. (tek eleman vereceği için, foreach ile yazdırılmaz.
    // bütün soru syso nun içine alınarak yazdırılabilir)

    //limit(a):ilk a kadar elemanı verir.
    //skip(a):ilk a elemanı pas geç diğerlerini yazdır

    //mapToInt yada mapToDouble yapınca toplama için direk sum() metodunu kullanabiliyoruz,
    // reduce e gidip Integer classtan sum(), average(), max(), min() metodlarını ı çağırmaya gerek kalmıyor

    //contains() : kapsıyormu sorusuna boolean yanıt verir, count(): istenen elemanın sayısını buluyor
    //örneğin:list.stream().contains("Day")).count();==> list teki Day içeren elemanların sayısını verir

    //List olarak verilmeyen sorularda, istenen sayı aralığını belirtmek için range(başlangıçdeğeri, bitiş değeri+1)
    // mesela==> 0 dan 15 e kadar olan sayıları toplamak için ==>IntStream.range(0, 16).sum() kullanılır.
    // sayı aralığı substring de olduğu gibi başlangıç (sol) dahil, bitiş (sağ) dahil değil

    //iterate():başlangıç değeri ve artış miktarı belli olan sorularda kullanılır
    // mesela==> iterate(5, t->t+3)===5 ten başla 3 er 3 er devam et

    // daha önceden yazdığımız bir files ı (dosyayı) okuyup, Console'a yazdirmak için;
    //      Files.lines(Paths.get("src/Lambda/FileForLambda")).forEach(System.out::println);

    //Files daki metinin içindeki kelimelerle tek tek işlem yapmak istediğimizde;
    ////mesela FileForLambda isimli dosyadaki tum farkli kelimeleri bir listin icinde ekrana yazdiriniz.
    //  System.out.println(Files.lines(Paths.get("src/Lambda/FileForLambda")).
    //  map(t->t.split(" ")).flatMap(Arrays::stream).//boşluklardan virgülle ayırıp Array yaptı,sonra array leri şelale gibi yazdırdı
    //      distinct().
    //      collect(Collectors.toList()));
    //harf harf incelemek istersek split("")
    // bazı noktalama işaretlerini şu şekilde silebiliriz==> map(t->t.replaceAll("^[a-zA-Z]", ""): harflerin dışındakiler
    // ya da
    //map(t->t.replaceAll("\\W", "")     \\W :harf ve rakam dışındakiler

}
