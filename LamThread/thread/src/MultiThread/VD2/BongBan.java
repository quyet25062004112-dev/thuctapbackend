package MultiThread.VD2;

public class BongBan implements Runnable{
    private String name;
    public BongBan(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5;i++){
            System.out.println(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread có vấn đề");
            }
        }
    }
}
