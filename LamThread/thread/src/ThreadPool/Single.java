package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single {
    public static void main(String[] args) {
        // chỉ 1 thread
        // đảm bảo thứ tự
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("Task A"));
        executor.execute(() -> System.out.println("Task B"));

        executor.shutdown();
        //  task A luôn chạy trc task B
    }
}
