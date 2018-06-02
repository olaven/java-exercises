import java.util.HashMap; 

public class UserRegister
{
    private HashMap<String, User> register; 
    
    private static UserRegister instance = new UserRegister(); 

    private UserRegister()
    {
        register = new HashMap<String, User>(); 
    }

    public static UserRegister getInstance()
    {
        return instance; 
    }

    /**
     * Checks if user exists
     */
    public boolean hasUser(String username)
    {
        if(register.containsKey(username))
        {
            return true; 
        }
        return false; 
    }

    /**
     * Validate credentials 
     */
    public boolean validate(String username, int passwordHash)
    {
        if(hasUser(username)){
            if(register.get(username).validate(passwordHash))
                return true; 
        }
        return false; 
    }
    
    /**
     * Add user if not already added 
     */
    public void add(String username, int passwordHash) throws Exception
    {
        if(hasUser(username))
            throw new Exception("User already in register."); 
        register.put(username, new User(username, passwordHash)); 
    }
}