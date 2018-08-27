import java.util.ArrayList; 

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // Start the server and run it in a terminal window

        try {
            ArrayList<MyClient> clients = new ArrayList<MyClient>(); 
            
            clients.add(new MyClient()); 
            clients.add(new MyClient()); 
            clients.add(new MyClient()); 

            for(MyClient client : clients) {
                client.startConnection("127.0.0.1", 6666); 
                System.out.println("---------------"); 
                System.out.println("from server: " + client.sendMessage("hello"));  
            }

        } catch (Exception e) {
            System.out.println("----------------------------------------");
            System.out.println("IOException occured when starting client");
            System.out.println("Are you sure that the server is running?");
            System.out.println("----------------------------------------");
        }
    }
}