//import matematik.DortIslem;
//import matematik.Logaritma;

// veya paket içerisindeki herşeyi import etmek için:
import matematik.*;

import java.util.Scanner;
public class Main {
    /*
    bir pack veya bir projede o pack i kullanmak için onu
    import etmeliisin!
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");

        String  name = scanner.nextLine();

        System.out.println("Merhaba "+name);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(1,2);

        Logaritma logaritma =new Logaritma();
        logaritma.logaritmaHesapla();

    }
}