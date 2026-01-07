package MultiThread.VD2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("bắt đầu đánh");

        Thread b1 = new Thread( new BongBan("bong"));
        Thread b2 = new Thread( new BongBan("binh"));
        b1.start();
        b2.start();
        b1.join();
        b2.join();
        System.out.println("đánh kết thúc");
    }
}
