package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {
    public static void main(String[] args) {
        // số Thread cố định
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId +
                        " chạy bởi " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();

    }
}
