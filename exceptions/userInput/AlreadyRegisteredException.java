public class AlreadyRegisteredException extends Exception{
    public AlreadyRegisteredException(){}
    public AlreadyRegisteredException(String message){
        super(message); 
    }
}