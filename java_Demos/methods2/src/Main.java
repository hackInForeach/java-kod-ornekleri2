public class Main {
    public static void main(String[] args) {
        //operasyon=metod=fonksiyon aynı anlam farklı ifade
    String mesaj = "Bugü hava çok soğuk";
    String yeniMesaj = sehirVer();
    System.out.println(yeniMesaj);
    int sayi = topla(5,7);
    System.out.println(sayi);
    int topla=topla2(1,2,3,4,1,2,2,3,1,2,3,3);
    System.out.println(topla);

    }
    // void operasyonlara emredersiniz "şunu sil vb."
    public static void added(){

    }
    public static void updated(){

    }
    public static void deleted(){

    }
    public static int topla(int number1,int number2){
        return number1+number2;
    }
    public static int topla2(int... sayilar){// 3 nokta: birden fazla girdi iler işlem yap
        //arka planda int değerleri int array yani tamsayı dizisine çeviriyor 3 nokta saysinde
        int toplam=0;
        for (int sayi:sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }

}