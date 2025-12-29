package Threadvongdoi;

public class Thread1Test extends Thread {
    @Override
    public void run() {

        for(int i=0;i<5;i++){
            System.out.println(this.getName()+" "+i);
            System.out.println("so ra là");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Thread1Test thread1 = new Thread1Test();
        Thread1Test thread2 = new Thread1Test();

        thread1.setName("A");
        thread2.setName("B");

        thread1.start();
        thread2.start();
    }


}
