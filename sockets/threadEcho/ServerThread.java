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

    /**
     * Runs the thread 
     * (triggred via Thread.run(), it seems)
     */
    public void run() {
        try {
            input = new DataInputStream(socket.getInputStream());
            output = new PrintStream(socket.getOutputStream());

            listenAndRepeat();

        } catch (IOException e) {
            System.out.println("IOException in ServerThread"); 
        }

        close(); 
    }

    /**
     * Listens to input from client and 
     * repeats it back 
     */
    public void listenAndRepeat() {
        String inputString = null; 
        while((inputString = input.readLine()) != null) {
            output.println("From server: " + inputString); 
            inputString = input.readLine(); 
        }
    }

    /**
     * Closes down the server thread 
     */
    public void close() {
        try {
            input.close();
            output.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Something went wrong when closing");
        }
    }
}