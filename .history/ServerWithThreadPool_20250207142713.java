import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerWithThreadPool {

    public void handleClient(Socket clienSocket){
        PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream(),true)

    }





    public static void main(String[] args) throws IOException {
        ServerWithThreadPool server = new ServerWithThreadPool();
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);


    }
}
