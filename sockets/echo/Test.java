/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // given a server running on localhost, port 5000

        try {
            Client client = new Client(); 
            client.run("127.0.0.1", 5000); 

            String resp1 = client.sendMessage("This is the first message from client!"); 
            String resp2 = client.sendMessage("This is the second message from client!");
            String resp3 = client.sendMessage("This is the third message from client!");
            String resp4 = client.sendMessage("This is the fourth message from client!");
            String resp5 = client.sendMessage("This is the fifth message from client!");

            System.out.println(resp1); 
            System.out.println(resp2);
            System.out.println(resp3);
            System.out.println(resp4);
            System.out.println(resp5);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("is your server running?"); 
        }
    }
}