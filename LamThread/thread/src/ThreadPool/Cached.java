package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cached {
    public static void main(String[] args) {
        //tạo thread mới nếu thiếu
        // tái sử dụng thread cũ
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(() -> System.out.println("Task 1"));
        executor.execute(() -> System.out.println("Task 2"));

        executor.shutdown();
       // phù hợp task ngắn , nhiều đợt
    }
}
