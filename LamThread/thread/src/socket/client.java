package socket;

import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",8080);
        System.out.println("đã kết nối với server");
        socket.close();
    }
}
