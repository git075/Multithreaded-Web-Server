import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientWithThreadPool {

    public void connectToServer(){
        int port = 8010;
        try {
            InetAddress address = InetAddress.getByName("loclahost");
            Socket socket = new Socket(address,port);
            PrintWriter toServer = new PrintWriter(socket.getOutputStream());
            BufferedReader fromServer = new BufferedReader()
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        



    }
}
