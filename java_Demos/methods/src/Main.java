public class Main {
    public static void main(String[] args) {// code mainden çalışıp dallanır
        //örneğin:
        sayiBulmaca();//1. ekran
        sayiBulmaca();//2. ekran
        sayiBulmaca();//3. ekran
        sayiBulmaca();//4. ekran

        /*
        ÖNEMLİ: JAVA DA FONK. İSİMLERİ CAMELCASİNG YANİ KELİMENİNİ İLK HARFİKÜÇÜK ARDINDAN GELEN KELİMELERİN İLK HARFİ BÜYÜK YAZILIR
        DEVE YAZIMI

        CLASS İSİMLERİ PASCAL CASİNG YAZILIR
         */
    }

    public static void sayiBulmaca() {// metodun ismi sayiBulmaca()
        int[] numbers = new int[]{1, 2, 4, 6, 7, 8, 0};
        int aranacak = -4;//tanımlandığı block içinde geçerli
        boolean yes = false;
        for (int number : numbers) {
            if (aranacak == number) {
                yes = true;
                break;
            }
        }
        if (yes == true) {
            mesajVer("Dizi içinde mevcuttur" + aranacak);
        } else {
            mesajVer("Dizi içinde mevcut değildir" + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {//mesajVer(int aranacak)= parametreli metod
        System.out.println(mesaj);
    }



}