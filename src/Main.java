import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Main {
    private static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        int portNumber = 4444;
        serverSocket = null;

        try {
            serverSocket = new ServerSocket(portNumber);
        } catch (IOException e) {
            System.err.println("Couldn't listen on port : "+portNumber);
            System.exit(1);
        }
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        serverSocket.close();
    }
}
