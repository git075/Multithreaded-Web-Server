import java.net.InetAddress;

public class ClientWithThreadPool {

    public void connectToServer(){
        int port = 8010;
        try {
            InetAddress address = InetAddress.getByName("loclahost");
            Socket socket = new 
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        



    }
}
