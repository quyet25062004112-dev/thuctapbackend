package VDSocKet.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class service {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("service đang chờ kết nối ...");

        Socket socket = serverSocket.accept();
        System.out.println("Client đã kết nối");

        socket.close();
        serverSocket.close();
    }
}
