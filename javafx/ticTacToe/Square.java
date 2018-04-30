import javafx.scene.control.Label; 

public class Square extends Label
{
    private boolean marked; 

    public Square(int dimension)
    {
        this.setMinWidth(dimension); 
        this.setMinHeight(dimension); 
    }

    public void setMark() throws Exception
    {
        throw new Exception("setMark is not implemented"); 
    }

    public boolean getMarked()
    {
        return marked; 
    }
}