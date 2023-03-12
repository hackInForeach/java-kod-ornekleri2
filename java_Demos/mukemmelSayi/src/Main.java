public class Main {
    public static void main(String[] args) {
        System.out.println("Girilen sayının mükemmel olup olmadığını söyleyen program");
        // girilen sayının pozitif bölenleri(kendisi hariç) toplamı kedisini veriyorsa o mükemmel sayıdır

        int number = 28;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (number == total) {
            System.out.println("Girilen sayı= " + number + " Ve bölenlerinin toplamı= "+total+" dır");
            System.out.println("Girilen sayı mükemmel sayıdır!");
        }else {
            System.out.println("Girilen sayı= " + number + " Ve bölenlerinin toplamı= "+total+" dır");
            System.out.println("Girilen sayı mükemmel sayı DEĞĞİLDİR!");
        }
    }
}