/**
 * A question ahs the data for a question. 
 * Text, answer and associated image 
 */
public class Question
{
    private String text; 
    private String answer; 
    private String imagePath; 


    public Question(String text, String answer, String imagePath)
    {
        this.text = text; 
        this.answer = answer; 
        this.imagePath = imagePath; 
    }

    public String getText()
    {
        return text; 
    }

    public String getAnswer() 
    {
        return answer;
    }

    public String getImagePath() 
    {
        return imagePath;
    }
}