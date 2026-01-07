package MultiThread.MyThread;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println("b"+i);
        }
        System.out.println("MyThread2 dang chay");
    }
}
