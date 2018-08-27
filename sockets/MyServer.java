import java.net.*; 
import java.io.*; 

public class MyServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        String greeting = in.readLine();
        if ("hello server".equals(greeting)) {
            out.println("hello client");
        } else {
            out.println("unrecognised greeting");
        }

        String fromClient; 
        loop: while((fromClient = in.readLine()) != null) {
            switch(fromClient) {
                case ".": 
                    out.println("good bye");
                    break loop; 
                case "hello server": 
                    out.println("hello client"); 
                    break; 
                default: 
                    out.println("I don't know what to say to that, I'm afraid.."); 

            }
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
        try {
            MyServer server = new MyServer();
            server.start(6666);
        } catch (IOException e) {
            System.out.println("IOException occured in server"); 
        }
    }
}