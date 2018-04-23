package soundPlayer;

import java.util.ArrayList; 

import java.io.File; 
import java.io.FileFilter;

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
     * @param directory directory to search 
     * @param filter array of supported extensions
     */
    public static ArrayList<File> getFilesFromDirectory(File directory, String[] filter) //implementer filter her 
    {
        ArrayList<File> files = directory.listFiles(); 
        for(File file : )
    }
    
}