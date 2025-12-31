package lock;

public class DeadLockDemo {
    static final Object A = new Object();
    static final Object B = new Object();
    static final Object c = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (A) {
                System.out.println("T1 giữ lock A");
                try { Thread.sleep(1000); } catch (Exception e) {}
                synchronized (B) {
                    System.out.println("T1 giữ lock B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (B) {
                System.out.println("T2 giữ lock B");
                try { Thread.sleep(2000); } catch (Exception e) {}
                synchronized (A) {
                    System.out.println("T2 giữ lock A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

