import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerWithThreadPool {

    public void handleClient(Socket clienSocket){
        try {
            PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream(),true);
            toClient.println("Hello from server side");
            clienSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args) throws IOException {
        ServerWithThreadPool server = new ServerWithThreadPool();
        int port = 8010;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is listening on port :" + port);

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while(true){
            Socket clienSocket = 
        }


    }
}
