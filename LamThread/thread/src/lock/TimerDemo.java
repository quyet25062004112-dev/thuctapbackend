package lock;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Chạy sau 3 giây");
            }
        };

        timer.schedule(task, 3000);
    }


}
