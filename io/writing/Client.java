import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.IIOException;

public class Client
{
    public static void main(String[] args)
    {
        Client.print("file.txt"); 
        Client.write("file.txt", "This is new content"); 
        Client.print("file.txt"); 
    }

    public static void write(String path, String content)
    {
        BufferedWriter writer; 
        try
        {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(content); 
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File was not found.."); 
        }
        catch(IOException e)
        {
            System.out.println("An error occured when writing"); 
        }
    }

    public static void print(String path)
    {
        BufferedReader reader; 
        try  
        {
            reader = new BufferedReader(new FileReader(path)); 
            String line = reader.readLine(); 
            while(line != null)
            {
                System.out.println(line); 
                line = reader.readLine(); 
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist.."); 
        }
        catch(IOException e)
        {
            System.out.println("An error when printing the file..");
        }
            
    }
}