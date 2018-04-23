/**
 * This describes a plane 
 */
public class Plane implements CanFly
{
    /**
     * This method is needed by all classes 
     * that implement CanFly, but it can 
     * contain whatever I want.
     */
    public void fly()
    {
        System.out.println("This plane is flying!"); 
    }
}