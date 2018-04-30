import javafx.scene.control.Label; 

public class Square extends Label
{
    private boolean marked; 
    private Symbol symbol; 

    public Square(int dimension)
    {
        this(dimension, Symbol.NONE); 
    }
    
    public Square(int dimension, Symbol symbol)
    {
        this.setMinWidth(dimension); 
        this.setMinHeight(dimension);
        this.setSymbol(symbol);  
    }

    public void setSymbol(Symbol symbol) throws Exception
    {
        this.symbol = symbol; 
    }

    public boolean getMarked()
    {
        return marked; 
    }
}