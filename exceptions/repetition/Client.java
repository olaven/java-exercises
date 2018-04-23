public class Client{
    public static void main(String[] args) {
        Client c = new Client(); 

        try{
            c.checkPassword("ikkeok");
            System.out.println("Dette passordet er ok"); //kjører ikke fordi exception kastes 
        } catch(InvalidPasswordException e){
            System.out.println(e.getMessage()); 
        }
        try {
            c.checkPassword("detteskalværeok");
            System.out.println("Dette passordet er ok");
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }

    public void checkPassword(String password) throws InvalidPasswordException {
        if(password.length() < 10){
            throw new InvalidPasswordException("This password is too short!"); 
        }
    }
}