public class Main {
    public static void main(String[] args) {

        System.out.println("Soru: sayının asal olup olmadığını söyleyen programı yazın");

        int number = 1;
        int endSwit = 0;
        if (number>1){
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    endSwit++;
                    break;
                }
            }
            if (endSwit > 0) {
                System.out.println("Sayı asal değil!");
            } else {
                System.out.println("Sayı asal");
            }
        }else {
            System.out.println("Lütfen 2 ve üzerinde bir değer giriniz!");
        }
    }
}