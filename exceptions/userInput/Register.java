import java.util.ArrayList; 
import java.util.List;

public class Register{
    ArrayList<String> list = new ArrayList<String>(); 
    
    /**
     * @param input the thing to be added 
     * @throws InvalidInputException illegal input 
     * @throws AlreadyRegisteredException thing already registered 
     */
    public void add(String input) throws InvalidInputException, AlreadyRegisteredException{
        if(list.contains(input))
            throw new AlreadyRegisteredException("You can not register the same thing >1 time."); 
        if(input.trim().length() == 0)
            throw new InvalidInputException("This String is empty."); 

        //all possible exceptions passed 
        list.add(input); 
    }
}