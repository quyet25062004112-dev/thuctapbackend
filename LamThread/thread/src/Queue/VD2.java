package Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class VD2 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(1);
        q.offer(4);
        q.offer(2);
        q.offer(5);
        q.offer(3);

        while (!q.isEmpty()) {
            System.out.println("su ly" + q.poll());
        }
    }



    }
