public class Dragon implements CanFly, CanWalk
{
    public static void main(String[] args) {
        Dragon d = new Dragon(); 
    }

    public void fly()
    {
        System.out.println("Implementation of flying"); 
    }

    public void walk()
    {
        System.out.println("Implementation of walking");
    }
}   