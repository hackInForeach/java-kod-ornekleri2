public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyot = " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor =" + threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi: " + threadName);
        }
        System.out.println("Thread bitti.");

    }
    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if (thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
