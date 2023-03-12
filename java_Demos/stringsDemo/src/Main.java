import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bügün hava çok soğuk";
        System.out.println(mesaj);


        System.out.println("Eleman sayısı: " + mesaj.length());
        // .lengnth() dizini uzunluğunu verir

        System.out.println("5.eleman: " + mesaj.charAt(4));
        //.charAt(4) dizi 0 dan başladığı için bize göre 5. eleman 4 oluyor

        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj);
        /*
         .concat(" Yaşasın") bir şeyi birleştirmek için kullanılır
           fakat tekrar yazdırdığımızda orijinal metin okunur çünkü o anlıktır
         */
        System.out.println(mesaj.startsWith("B"));
        // başlangıç içerdeki ifadeyle başlıyorsa true değilse false döndürür

        System.out.println(mesaj.endsWith("."));
        // bitiş içerdeki ifadeyle bitiyorsa true değilse false döndürür
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        /*
        mesaj dizisini 0 indexinden başla 4 e kadaral karakterlere dizisine 0 indexten başlayarak ata
         */

        System.out.println(mesaj.indexOf("av"));
        /*
        .indexof('a') içerideki karakterin kçıncı sırada olduğunu bulmaya yarar
        ve ilk bulduğu yerde durur ve metinde aranabilir
        .indexof("hava")
         */

        System.out.println(mesaj.lastIndexOf("a"));
        // aramaya sağdan başlar yukarıdaki fonksiyon ile aynı çalışır

        //replace(değiştirme) operasyonu
        System.out.println(mesaj.replace(' ','-'));
        // değiştirmek istenilen şey , değişenin yerine gelecek şey

        //değiştirilmiş mesajın kullanılması için:

        String newMesaj = mesaj.replace(' ','-');
        System.out.println(newMesaj);

        // bir metnin içerisinden parça almak için:
        System.out.println(mesaj.substring(0,5));
        // metinden belli bir yeri kesip aldık
        System.out.println("\n");
        // split() fonk. u içeridekine göre kelimeleri ayırmak için kullanılır
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println("\n");
        System.out.println(mesaj.toLowerCase());// tüm harfler küçük
        System.out.println(mesaj.toUpperCase());// tüm harfler büyük

        String newMesaj2 = mesaj;
        newMesaj2 ="    Bugün hava çok soğuk.   ";
        System.out.println(newMesaj2);
        //baş ve sondaki fazladan boşlukları silmek için:
        System.out.println(newMesaj2.trim());
        // trim() fonl u kullanılır



    }

}