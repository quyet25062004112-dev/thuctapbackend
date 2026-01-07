package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) {
        {
            try {
                DatagramSocket socket = new DatagramSocket(9090);
                byte[] buf = new byte[1024];

                System.out.println("UDP Server đang chờ lấy dữ liệu...");

                DatagramPacket packet = new DatagramPacket(buf, buf.length);

                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());

                System.out.println("nhận từ client: "+message);
                socket.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
