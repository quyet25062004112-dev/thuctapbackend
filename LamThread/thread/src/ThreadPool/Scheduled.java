package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduled {
    public static void main(String[] args) {
        // chạy task định kỳ trễ;
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() ->
                        System.out.println("Chạy sau 3 giây"), 3, TimeUnit.SECONDS);
        scheduler.shutdown();

    }
}
