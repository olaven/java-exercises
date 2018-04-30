import javafx.application.Application; 

import javafx.stage.Stage; 

import javafx.scene.Scene; 
import javafx.scene.layout.GridPane; 

/**
 * Board game client 
 */
public class Client extends Application
{
    private int windowDimension = 900; 

    public void start(Stage stage)
    {
        GridPane layout = Renderer.BoardWithCards(9, 3, windowDimension); 

        Scene scene = new Scene(layout, windowDimension, windowDimension); 

        stage.setScene(scene); 
        stage.setTitle("Tic Tac Toe"); 
        stage.show(); 
    }
}