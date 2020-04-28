import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//STEP 5 DONE
public class Main {
    private static ServerSocket serverSocket;
    private static int portNumber;

    public static void main(String[] args) throws IOException {
        portNumber = 4444;
        serverSocket = null;

        try {
            serverSocket = new ServerSocket(portNumber);
            acceptClient();
        } catch (IOException e) {
            System.err.println("Couldn't listen on port : "+portNumber);
            System.exit(1);
        }

        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        serverSocket.close();
    }

    private static void acceptClient() {

        try {
            Socket socket = serverSocket.accept();
            System.out.println("Client Accepted");
            ClientThread client = new ClientThread(socket);
            Thread thread = new Thread(client);
            thread.start();
        } catch (IOException e) {
            System.out.println("Accept Failed on: " + portNumber);
        }
    }
}
