public abstract class Meter
{
    private int id; 
    private int location; 
    private boolean working; 

    public Meter()
    {
        this(-1); 
    }

    public Meter(int location)
    {
        this(location, true); 
    }

    public Meter(int location, boolean working)
    {
        setId(this.hashCode()); 
        setLocation(location); 
        setWorking(working); 
    }

    @Override
    public String toString()
    {
        return "" 
        + "\n id:" + id
        + "\n location:" + location
        + "\n workings:" + (working ? "yes" : "no"); 
    }

    public int getId()
    {
        return id; 
    }
    
    public int getLocation() {
        return location;
    }
    
    public boolean getWorking() {
        return working;
    }

    public void setId(int id)
    {
        this.id = id; 
    }
    
    public void setLocation(int location) {
        this.location = location;
    }
    
    public void setWorking(boolean working) {
        this.working = working;
    }
}