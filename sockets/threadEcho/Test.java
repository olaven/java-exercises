import java.util.ArrayList;
import java.util.Scanner;
/** 
 * @author @olaven
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String ip = "127.0.0.1"; 
        int port = 3400; 

        if (args.length == 0) {
            System.out.println(""
                +"\nDefault port set: 3400"
                +"\nDefault ip set: 127.0.0.1"
                +"\n"
                +"\nTo specify:"
                +"\njava Test PORT IP. (Ip may be ommited)"
            ); 
        }

        if(args.length == 1) {
            try {
                port = Integer.parseInt(args[0]); 
            } catch (Exception e) {
                System.out.println("port has to be an int."); 
                return; 
            }
        }


        System.out.println("How many clients do you want to connect? 5 is default");  
        String input = new Scanner(System.in).nextLine();  
        
        int amountOfClients; 
        try {
            amountOfClients = Integer.parseInt(input); 
        } catch (Exception e) {
            amountOfClients = 5; 
        }

        Test.connectClients(amountOfClients, ip, port); 
    }

    /**
     * Connects a certain amount of clients- 
     * and sends a message to the server    
     * @param amount of clients
     * @param ip of server instance
     * @param port of server instance
     */
    private static void connectClients(int amount, String ip, int port) {
        for(int i = 0; i < amount; i++) {
            try {
                Client client = new Client(ip, port);
                String message = "Message from client " + (i + 1);

                String response = client.sendMessage(message);
                System.out.println(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}