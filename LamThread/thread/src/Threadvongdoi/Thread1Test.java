package Threadvongdoi;

public class Thread1Test extends  Thread {
    @Override
    public void run(){

        for(int i = 0; i < 5 ; i++){
            System.out.println(this.getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        Thread1Test t1 = new Thread1Test();
        Thread1Test t2 = new Thread1Test();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }



}
