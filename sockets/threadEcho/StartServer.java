/**
 * StartServer
 */
public class StartServer {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: 'java StartServer PORT'"); 
            System.out.println("Example: 'java StartServer 3400'"); 
        }
        
        int port; 
        try {
            port = Integer.parseInt(args[0]); 
            new Server().start(port); 
        } catch (Exception e) {
            System.out.println("port has to be a number"); 
        }
    }
}