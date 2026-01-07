package TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args)  {
        try {
            Socket socket = new Socket("localhost",8080);

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(),true);
            out.println("hello CTP Server");

            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
