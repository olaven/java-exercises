public class Layer2 {
    public static void method()
    {
        try
        {
            Layer3.method(); 
        } catch(Exception e)
        {
            System.out.println("This is another exception, 'longer down'."); 
            System.out.println("It is prioritized / 'closer to the actual throwing'.");
        }
    }
}