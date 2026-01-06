package SocKetChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8080);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader keyboard =
                    new BufferedReader(new InputStreamReader(System.in));
            String msgFromServer, msgFromClient;
            while (true){
                //gửi cho server
                System.out.println("Client: ");
                msgFromClient = keyboard.readLine();
                out.println(msgFromClient);
                if(msgFromClient.equalsIgnoreCase("bye"))
                    break;
                // nhận từ server
                msgFromServer = in.readLine();
                System.out.println("Server: "+msgFromServer);
            }
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
