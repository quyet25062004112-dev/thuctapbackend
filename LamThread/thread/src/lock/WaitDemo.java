package lock;

public class WaitDemo {
    static final Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("T1 giữ lock và wait()");
                try {
                    lock.wait(); // NHẢ lock
                } catch (InterruptedException e) {}
                System.out.println("T1 tiếp tục chạy");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("T2 vào được synchronized");
                lock.notify();
            }
        });

        t1.start();
        try { Thread.sleep(3000); } catch (Exception e) {}
        t2.start();
    }
}
