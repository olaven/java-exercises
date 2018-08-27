import java.net.*; 
import java.io.*; 
/**
 * ClientHandler
 */
public class ClientHandler extends Thread{
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

    public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(
              new InputStreamReader(clientSocket.getInputStream()));
             
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (".".equals(inputLine)) {
                    out.println("bye");
                    break;
                }
                out.println(inputLine);
            }
 
            in.close();
            out.close();
            clientSocket.close();
            } catch (Exception e) {
                System.out.println("exception thrown in thread: " + this); 
            }
        }
}