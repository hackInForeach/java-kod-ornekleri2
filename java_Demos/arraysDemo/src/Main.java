public class Main {
    public static void main(String[] args) {
        // çalışılacak şeyn yanında [] bunu tanımla bu dizi demek

        //Bu kısım öğrenme aşaması
        String ogrenci1 = "Ahmet";
        String ogrenci2 = "Ayşe";
        String ogrenci3 = "Mustafa";
        String ogrenci4 = "Lale";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------");

        //Bu kısım birazdaha pratik olan kısım
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Ayşe";
        ogrenciler[2] = "Mustafa";
        ogrenciler[3] = "Lale";
        //ogrenciler[4] = "Ahmet"; //burası hatalı olacak çünki bellekte 4 yeıldı 5 değil

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------------");
        // daha profesyonel bir kullanım
        for (String ogrenci:ogrenciler){
            // kodunu herzaman açık ve kısa yola kaçmadan yaz ki herkez okuyabilsim!!
            //ogrenciler dizinindeki herbir elemanı(ogrenci) gez
            System.out.println(ogrenci);
        }

    }
}