public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("\n\n");
        //değişken isimlendirme java'da camelCase yazılır
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);
        System.out.println("\n\n");
        int vade = 12;
        double dolarDun = 18.3;
        double dolarBugun = 18.13;

        boolean dolarDustumu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun == dolarDun) {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        System.out.println("\n\n");
        //arry

        String[] krediler= {"Hızlı Kredi","Maaşını Halk Banktan","Mutlu Emekli"};

        //for
        for (int i=0;i< krediler.length;i++){
            System.out.println(krediler[i]);
        }
        System.out.println("\n\n");

        //foreach
        for (String kredi:krediler) {
            System.out.println(kredi);
        }

        System.out.println("\n\n");







    }
}