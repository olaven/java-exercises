package soundPlayer;

import java.util.ArrayList;
import java.util.Arrays;

import java.io.File; 

import javafx.application.Application; 
import javafx.stage.Stage; 

import javafx.event.ActionEvent;

import javafx.scene.Scene;  
import javafx.scene.layout.GridPane; 
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer; 
import javafx.scene.media.MediaView; 

/**
 * javafx client to present tracks to
 * the user and let the user play them. 
 */
public class Client extends Application
{
    public void start(Stage stage)
    {
        GridPane gridPane = new GridPane(); 

        Button chooseDirectoryButton = new Button ("Choose directory"); 
        chooseDirectoryButton.setOnAction(ActionEvent e -> {
            DirectoryReader.openDirectoryDialogue(stage); 
        }); 

        Scene scene = new Scene(gridPane, 400, 400); 
        stage.setScene(scene); 
        stage.setTitle("Music player"); 
        stage.show(); 
    }

    /**
     * Updates the list  
     */
    public void updateList()
    {
        //update files visible to user 
    }

    /**
     * Updates the media players track 
     */
    public void updatePlayer()
    {
        //update the list visible to the user 
    }
}