import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server{

    public Consumer<Socket> getConsumer(){
        return (clientSocket)->{
            try{
                Print
            }
        }
    }




    public static void main(String[] args) throws IOException {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        System.out.println("Server is listening on port " + port);

        Socket acceptedSocket = socket.accept();
        Thread thread = new Thread();
    }
}