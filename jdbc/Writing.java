// https://www.youtube.com/watch?v=Q4T7jg0Lv4E
/**
 * NOTE: This has not been tested. 
 * This comment will be removed when I have tested. 
 */

import java.sql.*;

public class Writing {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String password = "student";

        // Get a connection // url/databasename, username, password
        Connection myConnection = DriverManager.getConnection(url, user, password);

        // Create statement
        Statement myStatement = myConnection.createStatement();

        // Execute query
        String sql = "insert into employees"
                    + "(last_name, first_name, email)"
                    + "('Baggins', 'Frodo', 'frodo@baggins.shr'";

        ResultSet myResults = myStatement.executeUpdate("select * from employees");

        System.out.prinln("Insert complete"); 
    }
}