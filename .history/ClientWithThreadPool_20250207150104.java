import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientWithThreadPool {

    public void connectToServer(){
        int port = 8010;
        try {
            InetAddress address = InetAddress.getByName("loclahost");
            Socket socket = new Socket(address,port);
            PrintWriter toServer = new PrintWriter(socket.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            toServer.println("Hello from client side " + socket.getRemoteSocketAddress());
            String response = fromServer.readLine();
            System.out.println("Response from server : " + response);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        ClientWithThreadPool client = new ClientWithThreadPool();
        ExecutorService threadPool = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 50; i++) {
            
            
        }
    }
}
