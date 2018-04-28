package soundPlayer;

import java.util.ArrayList;
import java.util.Arrays;

import java.io.File; 

import javafx.application.Application; 
import javafx.stage.Stage; 

import javafx.scene.Scene;  
import javafx.scene.layout.GridPane; 
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer; 
import javafx.scene.media.MediaView; 

import javafx.event.ActionEvent; 


/**
 * javafx client to present tracks to
 * the user and let the user play them. 
 */
public class Client extends Application
{
    private Button chooseFolderButton; 
    ArrayList<String> acceptedExtensions = new ArrayList<>(Arrays.asList("mp3", "flac"));
    GridPane layout = new GridPane(); 

    public void start(Stage stage)
    {
        chooseFolderButton= new Button("Choose Folder");
        chooseFolderButton.setOnAction(event -> {
            File directory = DirectoryReader.openDirectoryDialogue(stage);
            updateList(directory, acceptedExtensions); 
        }); 

        layout.add(chooseFolderButton, 2, 0); 

        layout.setGridLinesVisible(true);

        stage.setScene(new Scene(layout, 250, 500)); 
        stage.show(); 
    }
    /**
     * update GUI-list based on given directory
     */
    private void updateList(File directory, ArrayList<String> acceptedExtensions)
    {
        ArrayList<File> files = DirectoryReader.getFilesFromDirectory(directory, acceptedExtensions); 
        //print files 
        for(File file : files)
        {
            System.out.println(file.getName());
                        //string -> file -> string : REFACTOR 
            Media media = new Media(file.getPath()); 
            MediaPlayer mediaPlayer = new MediaPlayer(media); 
            MediaView mediaView = new MediaView(mediaPlayer);  

            layout.add(mediaView, 0, 0, 2, 2); 
        }
    }
}