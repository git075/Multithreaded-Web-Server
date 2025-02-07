import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server{

    public Consumer<Socket> getConsumer(){
        return (clientSocket)->{
            try{
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from server side");
                toClient.close();
                clientSocket.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Server server = new Server();
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        System.out.println("Server is listening on port " + port);

        Socket acceptedSocket = socket.accept();
        Thread thread = new Thread(());
    }
}