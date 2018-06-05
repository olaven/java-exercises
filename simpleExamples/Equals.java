/**
 * Equals
 */
public class Equals 
{

    public static void main(String[] args)
    {
        Equals e = new Equals("En verdi", "Verdi to"); 
        Equals e2 = new Equals("En verdi", "Verdi to"); 
        Equals b = new Equals("Annen verdi", "Annen verdi 2"); 

        if(e.equals(e2))
        {
            System.out.println("De ligner"); 
        }
    }

    private String field1; 
    private String field2; 

    public Equals(String field1, String field2)
    {
        this.field1 = field1; 
        this.field2 = field2; 
    }

    @Override 
    public boolean equals(Object object)
    {
        if(this == object) return true; 
        if(this == null || getClass() != object.getClass()) return false; 

        //Equals equals = (Equals) object; 
        object = (Equals) object; // FUNGERER IKKE 
 

        if(equals.getField1().equals(getField1()) && equals.getField2().equals(getField2())) return true; 
        return false; 
    }

    public String getField1()
    {
        return field1; 
    }

    public String getField2() {
        return field2;
    }
}