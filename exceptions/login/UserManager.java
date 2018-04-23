import java.util.HashMap; 

/**
 * Manages users 
 */
public class UserManager {
    HashMap<Integer, User> users;
    
    public UserManager(){
                            //hash, user 
        users = new HashMap<Integer, User>(); 
    }

    public User login(String userName, String password){
        
    }

    /**
     * Returns true if user exists 
     * @param userName username of user to be checked
     */
    public boolean hasUser(String userName){
        for(User user : users.values()){
            if(user.getUserName().equals(userName))
                return true; 
        }
        return false; 
    }

    public void add(User user) throws InvalidLoginActionException{
        try {
            users.put(user.hashCode(), user);
        } catch (Exception e) {
            throw new InvalidLoginActionException("User does not exist."); 
        }
    }

    /**
     * Remove user if it exists 
     */
    public void remove(User user) throws InvalidLoginActionException{
        try {
            users.remove(user.hashCode());
        } catch (NullPointerException e) {
            throw new InvalidLoginActionException("User does not exist."); 
        }
    }

}