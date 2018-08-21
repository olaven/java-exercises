// https://www.youtube.com/watch?v=2i4t-SL1VsU
/**
 * NOTE: This has not been tested. 
 * This comment will be removed when I have tested. 
 */
import java.sql.*; 

public class Reading {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo"; 
        String user = "student"; 
        String password = "student"; 
        
        // Get a connection                                  // url/databasename, username, password
        Connection myConnection = DriverManager.getConnection(url, user, password); 
        
        // Create statement 
        Statement myStatement = myConnection.createStatement(); 
        
        // Execute query 
        ResultSet myResults = myStatement.executeQuery("select * from employees"); 

        // Process result
        while(myResults.next()) {
            System.out.println(myResults.getString("last_name") + ", " + myResults.getString("first_name")); 
        }
    }
}