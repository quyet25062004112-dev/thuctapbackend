package MyThread;

public class main {
    public static void main(String[] args) {
       MyThread1 my1 = new MyThread1();

       MyThread1 m11 = new MyThread1();

       MyThread2 m2 = new MyThread2();
       Thread t2 = new Thread(m2);

       MyThread3 my3 = new MyThread3();
       MyThread3 m4 = new MyThread3();

       my1.start();
       t2.start();
       my3.start();
       m4.start();
       m11.start();
    }
}
