import java.net.Socket; 
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.IOException;

/**
 * @author @olaven
 * ServerThread
 */
public class ServerThread extends Thread {
    Socket socket; 
    DataInputStream input; 
    PrintStream output; 

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket; 
    }

    public void run() {
        try {
            input = new DataInputStream(socket.getInputStream());
            output = new PrintStream(socket.getOutputStream());
            String inputString = null;
            while ((inputString = input.readLine()) != null) {
                output.println("From server: " + inputString);
            }
        } catch (IOException e) {
            System.out.println("IOException in ServerThread"); 
        }

        try {
            input.close();
            output.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Something went wrong when closing"); 
        }
         
    }
}