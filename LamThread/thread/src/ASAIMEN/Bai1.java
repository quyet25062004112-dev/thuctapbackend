package ASAIMEN;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    // Biến dùng để dừng chương trình
    private static volatile boolean running = true;

    public static void main(String[] args) {

        // Thread ghi số random ra file
        Thread writerThread = new Thread(() -> {
            Random random = new Random();

            try (FileWriter writer = new FileWriter("output.txt", true)) {
                while (running) {
                    int number = random.nextInt(100); // random 0–99
                    writer.write(number + "\n");
                    writer.flush(); // ghi ngay ra file

                    System.out.println("Ghi số: " + number);
                    Thread.sleep(2000); // mỗi 1 giây
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread ghi file đã dừng.");
        });

        writerThread.start();

        // Luồng chính đọc lệnh từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gõ 'stop' để dừng chương trình:");

        while (true) {
            String input = scanner.nextLine();
            if ("stop".equalsIgnoreCase(input)) {
                running = false;
                break;
            }
        }

        System.out.println("Chương trình kết thúc.");
    }
}
