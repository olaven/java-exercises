/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // Start the server and run it in a terminal window

        try {
            MyClient client = new MyClient();
            client.startConnection("127.0.0.1", 6666);

            String response = client.sendMessage("hello server");
            System.out.println("First response from server: " + response);

            response = client.sendMessage("something unknown"); 
            System.out.println("Second response from server: " + response);

            response = client.sendMessage(".");
            System.out.println("Third response from server: " + response);


            client.stopConnection();
            
        } catch (Exception e) {
            System.out.println("----------------------------------------");
            System.out.println("IOException occured when starting client"); 
            System.out.println("Are you sure that the server is running?");
            System.out.println("----------------------------------------");
        } 
    }
}