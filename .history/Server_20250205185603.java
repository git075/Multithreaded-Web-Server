import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{




    public static void main(String[] args) throws IOException {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        System.out.println("Server is listening on port " + port);

        Socket acceptedSocket = socket.accept();
        
        
    }
}