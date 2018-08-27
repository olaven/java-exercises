import java.net.*;
import java.io.*;

public class MyMultithreadedServer {
    private ServerSocket serverSocket;


    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);

        while(true) {
            new ClientHandler(serverSocket.accept()); 
        }
    }

  

    public static void main(String[] args) {
        try {
            MyMultithreadedServer server = new MyMultithreadedServer();
            server.start(6666);
        } catch (IOException e) {
            System.out.println("IOException occured in server");
        }
    }
}