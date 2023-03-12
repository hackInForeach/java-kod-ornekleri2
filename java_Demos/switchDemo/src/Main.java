import java.awt.*;

public class Main {
    public static void main(String[] args) {
        char grade = 'D';
        // bu kodu derlemek için CNTRL+SHIFT+ALT+L ye bas RUN de
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Peki : Geçtiniz");
                break;
                //2 farklı durum için aynı çıktı verilemsi isteniyorsa:
            case 'C':
            case 'D':
                System.out.println("Orta : Sorumulu Geçtiniz");
                break;// gibi olması yeterli
            case 'F':
                System.out.println("Kötü : Kaldınız");
                break;
            default: // yukarıdakilerden farklı bir durum söz konusu ise bu çalışsın
                System.out.println("Lütfen: A,B,C,D ve F harf notlarından birini giniz! ");
        }

    }
}