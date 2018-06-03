import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.IOException;

public class Client
{
    public static void main(String[] args)
    {
        BufferedReader reader = null; 
        try {
            reader = new BufferedReader(new FileReader("content.txt"));
            String line = reader.readLine(); 
            while(line != null)
            {
                System.out.println(line); 
                line = reader.readLine(); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.."); 
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.."); 
        }
        
    }
}