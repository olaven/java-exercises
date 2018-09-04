import java.net.ServerSocket;
import java.net.Socket; 
import java.io.IOException;


/**
 * @author @olaven
 * Server
 */
public class Server {
    ServerSocket serverSocket; 

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port); 

        while(true) { // always listen
            // When a connection is requested, 
            // the socket is passed to another thread 
            ServerThread thread = new ServerThread(serverSocket.accept()); 
            thread.start();// start kommer fra thread
        }
    }
}