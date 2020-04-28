import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket socket;

    public  ServerThread(Socket socket1){
        this.socket = socket1;
    }

    @Override
    public void run() {

    }
}
