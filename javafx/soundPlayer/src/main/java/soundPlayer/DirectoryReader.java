package soundPlayer;

import java.util.ArrayList; 

import java.io.File; 

import javafx.stage.Stage; 
import javafx.stage.DirectoryChooser;


/**
 * Provides functionality for 
 * - open file dialogue 
 * - list return file with specified extensions 
 */
public class DirectoryReader 
{
    /**
     * opens a dialogue and returns selected directory
     * @param stage the stage to open dialogue in/via  
     */
    public static File openDirectoryDialogue(Stage stage)
    {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Find Directory");
        return directoryChooser.showDialog(stage);
    }

    /**
     * Return a list with all files in directory
     * as ArrayList
     * @param directory directory to search 
     * @param filter list of supported extensions
     */
    public static ArrayList<File> getFilesFromDirectory(File directory, ArrayList<String> filter) //implementer filter her 
    {
        //i want an arraylist becuase they are easier to deal with
        File[] unfiltered = directory.listFiles(); 
        ArrayList<File> filtered = new ArrayList<File>(); 
        
        //pick only the files with right extensions 
        for(int i = 0; i < unfiltered.length; i++)
        {
            for(String extension : filter)
            {
                String name = unfiltered[i].getName();
                if(name.endsWith(extension))
                    filtered.add(unfiltered[i]);
            }
        }
        return filtered; 
    }
    
}