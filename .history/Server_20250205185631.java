import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{




    public static void main(String[] args) {
        int port = 8010;
        try (ServerSocket socket = new ServerSocket(port)) {
            socket.setSoTimeout(10000);
            System.out.println("Server is listening on port " + port);

            Socket acceptedSocket = socket.accept();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Thread thread = new Thread();
        
        
    }
}