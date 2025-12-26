package MyThread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<4;i++){
            System.out.println("a"+i);
        }
        System.out.println("MyThread1 is running");

    }

}
