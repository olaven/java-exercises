import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;

public class Client extends Application
{

    private Scene scene; 

    private GridPane gridPane; 

    private Button b1 = new Button("hei");
    private Button b2 = new Button("hei");
    private Button b3 = new Button("hei");
    private Button b4 = new Button("hei");
    private Button b5 = new Button("hei");
    private Button b6 = new Button("hei");
    private Button b7 = new Button("hei");
    private Button b8 = new Button("hei");
    private Button b9 = new Button("hei");




    public void start(Stage stage)
    {
        gridPane = new GridPane();
        
        b1.setMinWidth(200);
        gridPane.add(b1, 0, 1, 2, 1); 

        b2.setMinWidth(50); 
        gridPane.add(b2, 2, 1); 

        b3.setMinWidth(50); 
        gridPane.add(b3, 3, 1); 

        b4.setMinHeight(200); 
        b4.setMinWidth(100); 
        gridPane.add(b4, 0, 1, 1, 2); 


        scene = new Scene(gridPane, 300, 300); 
        stage.setScene(scene); 
        stage.show(); 
    }
}