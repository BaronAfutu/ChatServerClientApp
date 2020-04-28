import java.net.Socket;

public class ClientThread extends Main implements Runnable{
    private Socket socket;

    public ClientThread(Socket socket1){
        this.socket = socket1;
    }

    @Override
    public void run() {

    }
}
