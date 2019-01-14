import java.io.*;
import java.net.*;

public class Receiver extends Thread {
    Socket sock;
    BufferedReader sockReader;

    public Receiver(Socket sock) throws IOException{
        this.sock = sock;
        this.sockReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
    }

    public void run(){

    }

}
