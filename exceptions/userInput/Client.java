import java.util.Scanner; 


public class Client{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Client client = new Client(); 
        String input = null; 
        do{
            System.out.println("\n\nWhat should I add?");
            input = scanner.nextLine(); 
            client.add(input); 
        } while (!input.trim().toLowerCase().equals("quit")); 
        scanner.close(); 
    }

    Register register; 

    public Client(){
        register = new Register(); 
    }

    public void add(String input){
        try{
            register.add(input); 
        } catch(AlreadyRegisteredException e){
            System.out.println(e.getMessage()); 
        } catch(InvalidInputException e){
            System.out.println(e.getMessage()); 
        } finally{
            System.out.println("I have now tried to add: " + input); 
        }
    }
}