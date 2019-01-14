import java.io.IOException;
import java.net.Socket;

public class Client {
    public static final int PORT = 50007;
    public static final String HOST = "127.0.0.1";

    public static void main(String args[]) throws IOException{
        Socket sock;
        sock = new Socket(HOST, PORT);
        System.out.println("<Connected to:> " + sock);

        //new receiver thread
        new Receiver(sock).start();


        //terminating connection
        sock.close();
    }
}
