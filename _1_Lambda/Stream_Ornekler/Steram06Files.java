package lambda_tum._1_Lambda.Stream_Ornekler;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Steram06Files {
    public static void main(String[] args) throws IOException {
        // streamOrnekler in package in sagina tikla new file ac (mars.txt)
        // mars.txt dosyasinin sagina tikla copy path den adresi kopyala
        // Files.lines(Path.of() methodu dosya yolu tanimlar ve dosyadaki yolu string olarak alir,
        // lines kirmizi olursa Addd method signature yapilir ve daha sonra satirlar stream lestirilir
        // satirlar.forEach() ile satirlar yazdirilir
        Stream<String> satirlar =Files.lines(Path.of("C:\\Users\\asus\\IdeaProjects\\Lambda\\src\\streamOrnekler\\mars.txt"));  //Paths.get de olabilir
        //ya da path degiskeni bir String'e atanarak da kullanilir
        String path = "C:\\Users\\asus\\IdeaProjects\\Lambda\\src\\streamOrnekler\\mars.txt";
        //Stream<String> satirlar =Files.lines(Path.of(path)); bu sekilde de olabilir
        satirlar.forEach(System.out::println);
        System.out.println("******************************************************");

      //  satirlar.map(String::toUpperCase).forEach(System.out::println); //exception verir
            //cunku 19. satirda bir terminal operatoru kulllanildi forEach(). stream ler bir kere yazdirilir
            //yeniden yazdirmak icin bir daha bastan dosya okutmak gerek

    //Bir dosyadan okunan satirlari buyuk harf olarak konsola yazdiralim
        Files.lines(Path.of(path)).map(String::toUpperCase).forEach(System.out::println);

    //Dosyadan sadece ilk satiri okuyarak buyuk harf olarak konsola yazdiralim
        Files.lines(Path.of(path)).limit(1).map(String::toUpperCase).forEach(System.out::println);
        // bu soruda satir satir bolduk line ile o yuzden satır bir eleman oldu
        System.out.println("**********************************************************");

    // Dosyamizin 3. ve 4. satirlarini yazdiramak istiyoruz.
        Files.lines(Path.of(path)).map(String::toUpperCase).skip(2).limit(2).forEach(System.out::println);
        System.out.println("**********************************************************");

    //Dosyamizin icerisinde kac tane "bu" kelimesi vardir.
        System.out.println(Files.lines(Path.of(path)).map(String::toLowerCase).filter(t-> t.contains("bu")).count());

    //Dosyadaki tum kelimelei alt alta yazdiralim
        Files.lines(Path.of(path)).
                map(t->t.toLowerCase(Locale.ROOT).split(" ")).
                flatMap(Arrays::stream).distinct().
                forEach(System.out::println);

    //Kelimeler icerisinde M veya m harfi olanlari sayalim ve sonucu konsola yazdiralim

       long mSayisi= Files.lines(Path.of(path)).
                map(t->t.toLowerCase(Locale.ROOT).split("")).
                flatMap(Arrays::stream).
                filter(t-> t.equals("m")).count();
        System.out.println("M harfiiceren kelime sayisi :" +mSayisi); //19

    //Bosluk ve noktalama isaretleri haric dosyada kac adet karakter kullanildigini
    // hesaplayarak sonucu konsola yazdiran uygulamayi yaziniz.
        // \\W "a-z" U "A-Z" U "0-9" U "_" haric tumkarakterler demektir (U-> arti/birlesim)
        System.out.println(Files.
                lines(Path.of(path)).
                map(t->t.replace("_","").replaceAll("\\W","").
                        split("")).
                flatMap(Arrays::stream).
                count());


    }
}
