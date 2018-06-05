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
    public void start(Stage stage)
    {

        Label output = new Label();
        output.setMinWidth(300); 

        Button buttonHello = new Button("Start");
        buttonHello.setMinWidth(100); 
        buttonHello.setOnAction(event -> 
        {
            output.setText("Hello"); 
        });
        Button buttonNono  = new Button("Nono" );
        buttonNono.setMinWidth(100); 
        buttonNono.setOnAction(event -> 
        {
            output.setText("Nono"); 
        });
        Button buttonHeyho = new Button("Heyho");
        buttonHeyho.setMinWidth(100); 
        buttonHeyho.setOnAction(event -> 
        {
            output.setText("Heyho"); 
        });
            
        GridPane layout = new GridPane(); 
        layout.add(buttonHello,  0, 0); 
        layout.add(buttonNono,   1, 0); 
        layout.add(buttonHeyho,  2, 0); 
        
        layout.add(output, 0, 1, 3, 1); 

        Scene scene = new Scene(layout, 300, 300); 

        stage.setScene(scene); 
        stage.show(); 
    }
}