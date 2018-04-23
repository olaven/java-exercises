package soundPlayer;

import java.util.ArrayList;

import java.io.File; 

import javafx.application.Application; 
import javafx.stage.Stage; 

import javafx.scene.Scene;  
import javafx.scene.layout.GridPane; 
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button; 

import javafx.event.ActionEvent; 


/**
 * javafx client to present tracks to
 * the user and let the user play them. 
 */
public class Client extends Application
{
    private Button chooseFolderButton; 
    private ListView fileList; 
    private ArrayList<Label> fileLabels; 
    private String[] acceptedExtensions = {".mp3", ".flac"}; 

    public void start(Stage stage)
    {
        GridPane layout = new GridPane(); 

        chooseFolderButton= new Button("Choose Folder");
        chooseFolderButton.setOnAction(event -> {
            File directory = DirectoryReader.openDirectoryDialogue(stage);
            updateList(directory); 
        }); 

        fileList = new ListView(); //add file representation here 
        fileLabels = new ArrayList<Label>(); 

        layout.add(fileList, 0, 0, 2, 5); 
        layout.add(chooseFolderButton, 2, 0); 

        layout.setGridLinesVisible(true);

        stage.setScene(new Scene(layout, 250, 500)); 
        stage.show(); 
    }
    /**
     * update GUI-list based on given directory
     */
    private void updateList(File directory)
    {
        //only get 
        ArrayList<File> files = DirectoryReader.getFilesFromDirectory(directory, acceptedExtensions); 
        
    }
}