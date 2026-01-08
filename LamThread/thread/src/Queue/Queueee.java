package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queueee {
    public static void main(String[] args) {
        Queue<String>  q=new LinkedList();
        q.offer("nam");
        q.offer("dinh");
        q.offer("trang");
        q.offer("tuan");

//        System.out.println(q.isEmpty());//kiểm tra xem có trống không
//        System.out.println(q.size());// kiểm tra số phần tử
        q.poll();//xóa phần tử đầu tiên khỏi hàng đầu
        System.out.println(q.poll());//lấy và xóa
        System.out.println(q.peek());// lấy phần tử đầu tiên mà k xóa
//        System.out.println(q); // lấy ra 1 mảng của các phần tử này




    }
}
