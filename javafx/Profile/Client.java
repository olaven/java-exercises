import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.VBox; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 


public class Client extends Application 
{
    private Label mainHeader; 
    private Label interestHeader; 
    private Label wishlistHeader; 
    private TextArea interestArea; 
    private TextArea wishlistArea; 


    public static void main(String[] args)
    {
        launch(args); 
    }

    public void start(Stage stage)
    {
        VBox layoutContainer = new VBox();
        GridPane contentContainer = new GridPane();  
        
        mainHeader = new Label("My page"); 
        interestHeader = new Label("Write about your interests"); 
        wishlistHeader = new Label("Write down your wishlist"); 
        interestArea = new TextArea(); 
        wishlistArea = new TextArea(); 

        contentContainer.add(interestHeader, 0, 0);
        contentContainer.add(wishlistHeader, 1, 0); 
        contentContainer.add(interestArea  , 0, 1); 
        contentContainer.add(wishlistArea  , 1, 1);   

        layoutContainer.getChildren().addAll(mainHeader, contentContainer); 

        stage.setScene(new Scene(layoutContainer, 400, 400)); 
        stage.show(); 
    }
}