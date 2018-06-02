import java.util.ArrayList; 

/**
 * A quiz contains many questions. 
 * getCurrentQuestion() -> return the current Question
 * next() -> move to next question 
 * add() -> adds a question
 * addDefaultQuestions -> adds default questions
 */
public class Quiz
{
    private ArrayList<Question> questions; 
    private int currentQuestionIndex; 

    public Quiz()
    {
        currentQuestionIndex = 0;
        questions = new ArrayList<Question>(); 
    }

    /**
     * Returns current Question
     */
    public Question getCurrentQuestion() 
    {
        return questions.get(currentQuestionIndex);
    }

    /**
     * Go to next question 
     */
    public void next() 
    {
        if (questions.get(currentQuestionIndex) != null) {
            currentQuestionIndex++; 
        } 
    }

    /**
     * Adds a question 
     * @param text text of question 
     * @param answer answer of question 
     * @param imagePath path to question image 
     */
    public void add(String text, String answer, String imagePath)
    {
        questions.add(new Question(text, answer, imagePath)); 
    }

    /**
     * Get total amount of questions
     */
    public int getQuestionCount()
    {
        return questions.size(); 
    }

    /**
     * Returns true if there are more questins. Flase if not 
     */
    public boolean hasMoreQuestions()
    {
        if(questions.size() > currentQuestionIndex)
        {
            return true; 
        }
        return false; 
    }
    /**
     * Adds some default questions 
     */
    public void addDefaultQuestions()
    {
        add("Hvilken hovedstad?", "Oslo", "./images/norway.png"); 
        add("Hvilken hovedstad?", "Copenhagen", "./images/denmark.png");
        add("Hvilken hovedstad?", "Haag", "./images/netherlands.png");
        add("Hvilken hovedstad?", "London", "./images/uk.png");
    }
}