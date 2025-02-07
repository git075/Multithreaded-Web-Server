import java.net.InetAddress;
import java.net.Socket;

public class ClientWithThreadPool {

    public void connectToServer(){
        int port = 8010;
        try {
            InetAddress address = InetAddress.getByName("loclahost");
            Socket socket = new Socket(address,port);
            Print
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        



    }
}
