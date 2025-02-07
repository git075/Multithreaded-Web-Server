import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public Runnable getRunnable(){
        return new Runnable() {
            @Override
            public void run(){
                int port = 8081;
                try {
                    InetAddress address = InetAddress.getByName("localhost");
                    Socket socket = new Socket(address,port);
                    PrintWriter toSocket = new PrintWriter(socket.getOutputStream());


                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    
                    e.printStackTrace();
                }
            }
        };
    }







    public static void main(String[] args) {
        Client client = new Client();
        for(int i=0; i<100; i++){
            Thread thread = new Thread(client.getRunnable());
            thread.start();
        }
    }
}
