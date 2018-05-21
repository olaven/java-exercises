public class Layer1
{
    public static void main(String[] args)
    {
        try {
            Layer2.method();
        } catch (Exception e) {
            System.out.println("This is NOT run, as it is catched longer down in the call stack");
        }
    }
}