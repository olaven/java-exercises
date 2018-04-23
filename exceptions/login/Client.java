
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea; 
import javafx.event.ActionEvent; 
/**
 * login client 
 */
public class Client extends Application{
    TextArea username; 
    TextArea password; 
    Button submit; 

    public static void main(String[] args){
        launch(args); 
    }

    public void start(Stage stage){
        VBox layout = new VBox(); 

        submit = new Button("submit"); 
        submit.setMinWidth(100); 
        submit.setMinHeight(100);
        submit.setDefaultButton(true); 
        submit.setOnAction(this::buttonPressed); 

        username = new TextArea("username"); 
        password = new TextArea("password");

        layout.getChildren().addAll(username, password, submit); 

        stage.setScene(new Scene(layout, 300, 300)); 
        stage.show(); 
    }

    public void buttonPressed(ActionEvent event){
        if(event.getSource().equals(submit)){
            Manager.login(username.getText(), password.getText());  
        }
    }
}