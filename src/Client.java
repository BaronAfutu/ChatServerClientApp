import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        int portNumber = 4444;

        try{
            socket = new Socket("localhost",portNumber);
        }  catch (IOException e) {
            System.err.println("Fatal Connection Error!");
            e.printStackTrace();
        }
    }
}