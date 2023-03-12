public class Main {
    public static void main(String[] args) {
        int sayi = 15;
       /*
       if (sayi < 20){
            System.out.println("Sayı küçük 20 den A1");
        }else{
            System.out.println("Sayı küçük değil 20 den B1");
        }
        if (sayi <15){
            System.out.println("Sayı küçük 15 den A2");
        }else {
            System.out.println("Sayı küçük değil 15 den B2");
        }
        */

        // DEFANSIFE PROGRAMMİNG
        if (sayi < 20){
            System.out.println("Sayı küçük 20 den");

        } else if (sayi == 20) {
            System.out.println("Sayı esit 20 den");

        }else {
            System.out.println("Sayı büyük 20 den");
        }

    }
}