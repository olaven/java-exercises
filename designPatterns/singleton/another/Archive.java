public class Archive
{
    private static Archive instance = new Archive(); 
    private Archive(){}
    public static Archive getInstance()
    {
        return instance; 
    }
}