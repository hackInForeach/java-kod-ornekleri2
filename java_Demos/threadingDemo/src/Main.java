public class Main {
    public static void main(String[] args) {
        KronometreThread thread = new KronometreThread("thread1");
        KronometreThread thread1 = new KronometreThread("thread2");
        KronometreThread thread2 = new KronometreThread("thread3");
        thread.start();
        thread1.start();
        thread2.start();

    }
}