package VDSocKet.SocKetChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("server đang chờ client ...");

            Socket socket = serverSocket.accept();
            System.out.println("Client đã kết nối ");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(),true);
            BufferedReader keyboard =
                    new BufferedReader(new InputStreamReader(System.in));
            String msgFromClient , msgFromServer;

            while (true) {
                // nhận từ client
                msgFromClient = in.readLine();
                if(msgFromClient == null || msgFromClient.equalsIgnoreCase("bye"))
                    break;
                System.out.println("Client: "+msgFromClient);
                // gửi cho client
                System.out.println("Server");
                msgFromServer = keyboard.readLine();
                out.println(msgFromServer);

            }
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
