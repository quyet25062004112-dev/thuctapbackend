package MultiThread.VD;

class stall extends Thread{
    public void run(){
        System.out.println("Task chạy xong "+Thread.currentThread().getName());
    }
}
public class main {
    public static void main(String[] args) {
          stall stall = new stall();
          stall stall1 = new stall();

          stall.start();
          stall1.start();
    }

}
