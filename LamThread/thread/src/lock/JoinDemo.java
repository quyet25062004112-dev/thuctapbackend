package lock;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread con xong");
            } catch (InterruptedException e) {}
        });

        t.start();
        System.out.println("Main chờ thread con");
        t.join(); // WAITING
        System.out.println("Main chạy tiếp");
    }
}
