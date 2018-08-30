import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Client
 */
public class Client {

    Socket socket; 

    DataInputStream input; // from server 
    PrintStream output; // to server


    public void run(String adress, int port) throws IOException{
        socket = new Socket(adress, port);
        input = new DataInputStream(socket.getInputStream()); 
        output = new PrintStream(socket.getOutputStream()); 
    }

    /**
     * Sends a message to the client ant returns response 
     * @param message message to be sent 
     */
    public String sendMessage(String message) throws IOException{
        output.println(message); 

        String response = input.readLine();
        return response; 
    }
}