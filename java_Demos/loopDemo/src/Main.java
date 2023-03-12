public class Main {
    public static void main(String[] args) {
        //for
        for_Dongusu();
        //while
        while_Dogusu();
        //do-while
        do_while();

    }

    private static void do_while() {
        int i=1;
        do {
            // burada kod hata bile alınsa en az birkez çalışır.
            System.out.println(i);
            i = i + 1;
        }while (i <= 10);
        System.out.println("Do-While Döngüsü Bitti!");
    }
    private static void while_Dogusu() {
        int i=1;
        while (i <= 10) {// direk şart yazılır
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("While Döngü Bitti!");
    }
    private static void for_Dongusu() {
        for (int i = 1; i <= 10; i++) {
            // i birşey olduğu sürece dösün
            System.out.println(i);
        }
        System.out.println("For Döngü Bitti!");
    }
}