package MyThread;


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

// Cách 2: Triển khai giao diện Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

public class test {
    // Cách 1: Kế thừa lớp Thread

        public static void main(String[] args) {
// Sử dụng cách 1
            MyThread thread1 = new MyThread();
            thread1.start();

// Sử dụng cách 2
            MyRunnable my2 = new MyRunnable();
            Thread thread2 = new Thread(my2);
            thread2.start();
        }
    }

