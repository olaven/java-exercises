

/**
 * Exception thrown if identifying 
 * information like password ie. 
 * are not following rules.
 */
public class InvalidLoginActionException extends Exception{
    public InvalidLoginActionException(String message){
        super(message); 
    }
}