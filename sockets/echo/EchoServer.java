import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        try {
            EchoServer server = new EchoServer();
            server.run(5000); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ServerSocket serverSocket;
    private Socket socket; 

    DataInputStream input; // from client 
    PrintStream output; // to server 


    public void run(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        // blokker alt helt til den får kontakt med en klient
        // "socket" representerer kobling med klienten
        socket = serverSocket.accept();

        input = new DataInputStream(socket.getInputStream());
        output = new PrintStream(socket.getOutputStream());

        String inputLine; 
        while((inputLine = input.readLine()) != null) {
            output.println("echo: " + inputLine); 
        }
    }
}