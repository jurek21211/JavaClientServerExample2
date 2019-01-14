import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 50007;

    public static void main(String args[]) throws IOException{
        ServerSocket serv;
        serv = new ServerSocket(PORT);

        System.out.println("<Listeting:> " + serv);
        Socket sock;
        sock = serv.accept();
        System.out.println("<Connected:> " + sock);

        new Receiver(sock).start();



        serv.close();
        sock.close();
    }
}
