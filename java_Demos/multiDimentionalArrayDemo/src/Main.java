import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Çok boyutku dizilerler çalışma

        //satır dizisis için= []
        //satır ve sutun dizisi için = [][]

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Marmara";
        sehirler[0][1] = "İstanbulu";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "İç anadolu";
        sehirler[1][1] = "ankara";
        sehirler[1][2] = "Konya";
        sehirler[2][0] = "Güneydoğu anadolu";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i < 3; i++) {
            System.out.println("--------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }






    }
}