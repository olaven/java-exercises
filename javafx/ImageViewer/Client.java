import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.VBox; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 

public class Client extends Application
{
    Scene scene; 
    GridPane layout; 

    Label header; 
    ImageView imageView; 

    Button alertButton; 

    public void start(Stage stage)
    {
        layout = new GridPane(); 
        header = new Label("Show the image"); 
        imageView = new ImageView(new Image("elon.jpg")); 
        alertButton = new Button("Info"); 
        alertButton.setOnAction(event -> 
        {
            Alert alert = new Alert(AlertType.INFORMATION); 
            alert.setTitle("Info:"); 
            alert.setHeaderText("This is an image of a dog"); 
            alert.showAndWait(); 
        }); 


        layout.add(header   , 0, 0, 3, 1); 
        layout.add(imageView, 1,  0, 3, 1); 
        layout.add(alertButton, 0, 2, 3, 1); 


        Scene scene = new Scene(layout, 500, 500); 
        stage.show(); 
    }
}