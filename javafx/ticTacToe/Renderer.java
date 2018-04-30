import javafx.scene.layout.GridPane;
import javafx.scene.control.Label; 

public class Renderer
{
    /**
     * Returns a board with the squares 
     * @param amountOfCards total amount of cards 
     * @param amountPerRow total amount per row 
     * @param displayDimension total space the board should be displayed in s
     */
    public static Board BoardWithCards(int amounOfCards, int amountPerRow, int displayDimension)
    {
        Board board = new Board(displayDimension, displayDimension); 

        int row = 0; 
        int column = 0; 
        for(int i = 0; i < amounOfCards; i++)
        {
            if(i < amountPerRow - 1)
            {
                row++;
                column = 0;
            }
            else
            {
                column++; 
            }

            Square square = new Square(displayDimension / amountPerRow); //replace with square. could square inherit from label? 

            board.add(square, column, row); 
        }

        return board; 
    }

    public static void RenderBoard(Board board) throws Exception
    {
        throw new Exception("setMark is not implemented");
    }
}
