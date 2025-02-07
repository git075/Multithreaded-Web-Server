public class Client {



    
    public static void main(String[] args) {
        Client client = new Client();
        for(int i=0; i<100; i++){
            Thread thread = new Thread();
            thread.start();
        }
    }
}
