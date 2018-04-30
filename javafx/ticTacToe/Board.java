import java.util.HashMap; 
import javafx.scene.layout.GridPane;

/**
 * Board 
 * This class has a hashMap of squares, 
 * paired with square hashCode 
 */
public class Board extends GridPane
{
    private int width; 
    private int height; 
    private HashMap<Integer, Square> squares; 

    public Board(int width, int height)
    {
        setWidth(width); 
        setHeight(height); 
        squares = new HashMap<Integer, Square>(); 
    }

    /**
     * Add a new Square to the board 
     * @param square square to be added 
     * @throws Exception if square already is on the board
     */
    public void addSquare(Square square) throws Exception
    {
        if(squares.containsValue(square))
            throw new Exception("Duplicate squares not allowed in board"); 
        squares.put(square.hashCode(), square);

    }

    /**
     * Remove a square from the board 
     * @param square the square to add 
     * @throws Exception if square is not in board
     */
    public void removeSquare(Square square) throws Exception
    {
        if(!squares.containsValue(square))
            throw new Exception("Square did not exist"); 
        squares.remove(square);            
    }

    private void setWidth(int width)
    {
        this.width = width; 
    }
    
    private void setHeight(int height) {
        this.height = height;
    }
}