import java.util.HashMap; 
import java.util.ArrayList; 

import javafx.scene.layout.GridPane;
import javafx.scene.Node; 

import javafx.collections.ObservableList;

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

    /**
     * Get squares registered on board 
     */
    public ArrayList<Square> getSquares()
    {  
        ArrayList<Square> list = new ArrayList<Square>(); 
        for(Square square : squares.values())
        {
            list.add(square); 
        }
        return list; 
    }

    private void setWidth(int width)
    {
        this.width = width; 
    }
    
    private void setHeight(int height) {
        this.height = height;
    }
}