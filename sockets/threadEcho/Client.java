import java.net.Socket;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.IOException;

/**
 * Client
 * @author @olaven
 */
public class Client {
    Socket socket; 
    DataInputStream input; 
    PrintStream output; 

    public Client(String ip, int port) throws IOException {
        socket = new Socket(ip, port); 
        input = new DataInputStream(socket.getInputStream()); 
        output = new PrintStream(socket.getOutputStream()); 
    }

    public String sendMessage(String message) throws IOException {
        output.println(message); 

        String response = input.readLine(); 
        return response;
    }
    
}