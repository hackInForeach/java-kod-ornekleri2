public class Main {
    public static void main(String[] args)
    {
        int sayi = 1999999999; // - ile + arasında 2 milya küsür sayı tanımlananbilir 4byte
        byte sayi1 = 127;// ile -128 ekadar bir aralık değeri vardır 1byte
        short sayi2 = 32767; // -32758 e kadar bir aralık değeri vardir 2byte
        long sayi3 = 1999999999; // - ile + arasında daha fazla değer vardır 8byte
        float sayi4 = 1565415165; // 8byte daha ondalıklı sayı
        double sayi5= 651648946.324232343; // 8byte ondalıkı daha çok parasal veri

        char karakter = 'a'; // karakterler tk tırnak içinde yer alır ASCI code
        String karakterToplulugu = "abcd"; // karakter topluluğudur

        boolean dogruMu = false;

        if (dogruMu == true){
            dogruMu = true;
        }else{
            dogruMu = false ;
        }
    }
}