package lock;

public class SleepDemo {
    static final Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("T1 giữ lock, ngủ 3s");
                try {
                    Thread.sleep(3000); // KHÔNG nhả lock
                } catch (InterruptedException e) {}
                System.out.println("T1 xong");
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("T2 muốn vào synchronized");
            synchronized (lock) {
                System.out.println("T2 vào được synchronized");
            }
        });

        t1.start();
        t2.start();
    }
}
