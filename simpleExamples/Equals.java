/**
 * Equals
 */
public class Equals 
{
    private String field1; 
    private String field2; 

    @Override 
    public boolean equals(Object object)
    {   
        if(object == this) return true; 
        if(object == null || object.getClass != getClass()) return false; 

        // My idea of what should equal equality 
        if(getField1().equals(object.getField1()) && getField2().equals(object.getField2()))
            return true; 
    }

    public String getField1()
    {
        return field1; 
    }

    public String getField2() {
        return field2;
    }
}