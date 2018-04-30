package soundPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Observable;

import javafx.collections.FXCollections; 

import java.io.File; 

import javafx.application.Application; 
import javafx.stage.Stage; 

import javafx.scene.Scene;  
import javafx.scene.layout.GridPane; 
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView; 
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer; 
import javafx.scene.media.MediaView;

/**
 * javafx client to present tracks to
 * the user and let the user play them. 
 */
public class Client extends Application
{
    //global to be accessible for updates 
    ListView fileList = new ListView();
    GridPane gridPane = new GridPane();  

    public void start(Stage stage)
    {

        Button chooseDirectoryButton = new Button ("Choose directory"); 
        chooseDirectoryButton.setOnAction(event -> {
            File directory = DirectoryReader.openDirectoryDialogue(stage); 
            updateList(directory); 
        }); 

        gridPane.add(fileList, 0, 0, 1, 4); 
        gridPane.add(chooseDirectoryButton, 1, 0); 

        Scene scene = new Scene(gridPane, 400, 400); 
        stage.setScene(scene); 
        stage.setTitle("Music player"); 
        stage.show(); 
    }

    /**
     * Updates the list  
     */
    public void updateList(File directory)
    {
        //get new files, emtpy existing list and add new files
        List<String> filter = Arrays.asList("mp3");
        ArrayList<File> files = DirectoryReader.getFilesFromDirectory(directory, new ArrayList<String>(filter)); 

        fileList.getItems().clear(); 

        for(File file : files)
        {
            Label label = new Label(file.getName());
            label.setOnMouseClicked(event -> {
                String fileName = directory.getPath() + label.getText(); 
                fileName.replaceAll("\"", ""); 
                updatePlayer(fileName); 
            });  

            fileList.getItems().add(label); 
        }        
    }

    /**
     * Updates the media players track 
     */
    public void updatePlayer(String fileName)
    {
        //update the list visible to the user 
        MediaView mediaView = new MediaView();
        Media media = new Media(fileName);
        mediaView.setMediaPlayer(new MediaPlayer(media)); 
        System.out.println(fileName); 
        gridPane.add(mediaView, 0, 1); 
    }
}