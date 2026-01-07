package lock;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                count++;
                System.out.println("Chạy lần " + count);

                if (count == 5) {
                    timer.cancel(); // dừng Timer
                }
            }
        };

        timer.schedule(task, 3000, 2000);
    }
}
