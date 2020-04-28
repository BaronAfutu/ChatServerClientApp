import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        int portNumber = 4444;

        try{
            socket = new Socket("localhost",portNumber);
            System.out.println("Connection Established...");

            Thread.sleep(1000);
            Thread server = new Thread(new ServerThread(socket));
            server.start();
        }  catch (IOException | InterruptedException e) {
            System.err.println("Fatal Connection Error!");
            e.printStackTrace();
        }
    }
}
