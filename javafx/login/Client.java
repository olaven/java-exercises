import javafx.application.Application;
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import java.util.HashMap; 

public class Client extends Application
{
    private Scene mainScene; 
    private Scene registerScene; 
    private Scene loggedInScene; 

    private UserRegister userRegister = UserRegister.getInstance(); 

    public void start(Stage stage)
    {
        buildMainScene(stage); 
        buildRegisterScene(stage); 
        buildLoggedInScene(stage); 

        stage.setScene(mainScene); 
        stage.show(); 
    }

    private void buildMainScene(Stage stage)
    {
        // creating layout of main
        Label usernameLabel = new Label("Username");
        Label passwordLabel = new Label("Password");
        TextField usernameInput = new TextField();
        TextField passwordInput = new TextField();
        Button signIn = new Button("Sign in");
        Button register = new Button("Register");

        signIn.setOnAction(event -> {
            String username = usernameInput.getText().trim().toLowerCase(); 
            int passwordHash = passwordInput.getText().hashCode(); 

            if(!userRegister.hasUser(username))
            {
                usernameInput.setText("User does not exist!");
                passwordInput.setText("");
            } else 
            {
                if(userRegister.validate(username, passwordHash))
                    stage.setScene(loggedInScene); 
                else 
                {
                    usernameInput.setText(""); 
                    passwordInput.setText(""); 
                }
            }
        });
        
        register.setOnAction(event -> {
            stage.setScene(registerScene);
        });

        VBox labelsLayout = new VBox();
        labelsLayout.getChildren().addAll(usernameLabel, passwordLabel);

        VBox fieldsLayout = new VBox();
        fieldsLayout.getChildren().addAll(usernameInput, passwordInput); 

        VBox buttonsLayout = new VBox();
        buttonsLayout.getChildren().addAll(signIn, register);

        HBox mainLayout = new HBox();
        mainLayout.getChildren().addAll(labelsLayout, fieldsLayout, buttonsLayout);

        mainScene = new Scene(mainLayout, 400, 400);
    }

    private void buildRegisterScene(Stage stage)
    {
        Label usernameLabelRegister = new Label("Username"); 
        Label passwordLabelRegister = new Label("Password");

        TextField usernameInputRegister = new TextField(); 
        TextField passwordInputRegister = new TextField();

        Button register = new Button("Register"); 
        register.setOnAction(event -> 
        {
            String username = usernameInputRegister.getText().trim().toLowerCase(); 
            int password = passwordInputRegister.getText().hashCode(); 

            try {
                userRegister.add(username, password);
                stage.setScene(mainScene); 
            } catch (Exception e) {
                usernameInputRegister.setText("AlREADY TAKEN"); 
                passwordInputRegister.setText("");
            }
        }); 

        VBox labelsRegister = new VBox(); 
        labelsRegister.getChildren().addAll(usernameLabelRegister, passwordLabelRegister); 

        VBox inputRegister = new VBox(); 
        inputRegister.getChildren().addAll(usernameInputRegister, passwordInputRegister);

        HBox firstFieldsRegister = new HBox(); 
        firstFieldsRegister.getChildren().addAll(labelsRegister, inputRegister); 

        VBox registerLayout = new VBox(); 
        registerLayout.getChildren().addAll(firstFieldsRegister, register); 

        registerScene = new Scene(registerLayout, 350, 350); 
    }
    
    private void buildLoggedInScene(Stage stage)
    {
        Label loggedInLabel = new Label("Logged in!"); 
        loggedInScene = new Scene(loggedInLabel, 100, 100); 
    }
}