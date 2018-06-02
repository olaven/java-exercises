/**
 * This class is just added to make the example interactive
 */
public class User
{
    private String name;
    private int passwordHash;
    
    public User(String name, int passwordHash)
    {
        this.name = name; 
        this.passwordHash = passwordHash; 
    }

    /**
     * Having this here prohibits direct access off password outside of this class 
     */
    public boolean validate(int inputHash)
    {
        if(inputHash == passwordHash)
        {
            return true; 
        } 
        return false; 
    }
}