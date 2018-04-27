public abstract class Fruit{

    protected String name; 
    protected String description; 

    public Fruit(String name, String description){
        this.description = description; 
        this.name = name; 
    }

    @Override
    public String toString(){
        return ""
        + "\nName: " + name
        + "\nDescription: " + description; 
    }
}