import javafx.application.Application;
import javafx.application.Platform; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane; 
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label; 
import javafx.scene.image.ImageView; 
import javafx.scene.image.Image; 


public class Client extends Application
{
    Quiz quiz = new Quiz();
    Label header = new Label("Svar på spørsmål!"); 
    ImageView imageView = new ImageView(); 
    Label questionText = new Label(""); 
    TextArea inputField = new TextArea(); 
    Button button = new Button("Answer"); 
    Label scoreField = new Label(); 
    int score; 

    public static void main(String[] args)
    {
        launch(args); 
    }

    public void start(Stage stage)
    {
        score = 0; 
        quiz.addDefaultQuestions(); 
        GridPane layout = new GridPane(); 

        imageView.setFitHeight(200); 
        imageView.setFitWidth(200); 

        button.setOnAction(event -> 
        {
            // Check if correct 
            String correct = inputField.getText().trim().toLowerCase();
            String answer = quiz.getCurrentQuestion().getAnswer().trim().toLowerCase();  

            if(answer.equals(correct))
            {
                score += 1; 
            }

            if(quiz.hasMoreQuestions())
            {
                quiz.next(); 
                updateDisplayedData(); 
            } else 
            {
                Platform.exit(); 
            }
        }); 
                
        layout.add(header    , 0, 0); 
        layout.add(imageView , 0, 1); 
        layout.add(inputField, 0, 2); 
        layout.add(scoreField, 0, 3); 
        layout.add(button    , 0, 4); 

        Scene scene = new Scene(layout, 500, 500); 

        updateDisplayedData(); 
        stage.setScene(scene); 
        stage.show(); 
    }

    private void updateDisplayedData()
    {
        Question question = quiz.getCurrentQuestion();     

        questionText.setText(question.getText()); 

        Image image = new Image(question.getImagePath()); 
        imageView.setImage(image); 

        scoreField.setText(score + "/" + quiz.getQuestionCount()); 
    }
}