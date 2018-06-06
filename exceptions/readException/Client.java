import java.io.IOException;

import java.io.FileReader; 
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.IOException; 

public class Client
{
    public static void main(String[] args)
    {
        
        Client.print_handledException("file.txt"); 


        try {
            Client.print_propagatedException("file.txt"); 
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("I had to handle this."); 
        }
        catch (IOException e)
        {
            System.out.println("I had to handle this");
        }
    }
    public static void print_propagatedException(String path) throws FileNotFoundException, IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path)); 
        // printing 
        String line = reader.readLine(); 
        while(line != null)
        {
            System.out.println(line); 
            line = reader.readLine(); 
        }
    }
    public static void print_handledException(String path)
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(path)); 
            // printing 
            String line = reader.readLine(); 
            while(line != null)
            {
                System.out.println(line); 
                line = reader.readLine(); 
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Method handled this"); 
        }
        catch (IOException e)
        {
            System.out.println("Method handled this"); 
        }

    }
}