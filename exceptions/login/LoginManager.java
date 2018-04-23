import javax.activity.InvalidActivityException;

/**
 * Manages login validation
 */
public class LoginManager{
    private UserManager userManager; 

    public LoginManager(){
        userManager = new UserManager(); 
    }
    /**
     * Logs a user in 
     * 
     * @param username username of the user
     * @param password password of the user
     * @throws InvalidCredentialException 
     */
    public static void login(String userName, String password) throws InvalidLoginActionException{
        /**
         * Tests to handle: 
         * * username 
         * * * must exist [x]
         * * * > 2 chars
         * * * Start with alphanumerical chars 
         * * password 
         * * * > 10 chars 
         * * combined 
         * * * there is a user with this combination 
         */
        //tests on username 
        if(!userManager.hasUser(userName))
            throw new InvalidLoginActionException("Username is not registered");
        if(userName.length() <= 2)
            throw new InvalidLoginActionException("Username too short"); 
        if(!Character.isLetter(userName.toCharArray()[0]))
            throw new InvalidLoginActionException("Username must start with letter"); 
        //tests on password 
        if(password.length <= 10){
            throw new InvalidLoginActionException("Password is too short");
        }
        //test if right user/password combo 
        
    }
}