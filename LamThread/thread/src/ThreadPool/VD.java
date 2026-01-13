package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VD {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++) {
            int request = i;
            pool.execute(() -> {
                System.out.println("Xử lý request " + request);
                try { Thread.sleep(2000); } catch (Exception e) {}
            });
        }

        pool.shutdown();
        // 2 request xử lý song song , 2 request chờ
    }
}
