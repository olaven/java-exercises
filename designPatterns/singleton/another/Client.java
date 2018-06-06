public class Client
{
    public static void main(String[] args) {
        Archive a1 = Archive.getInstance(); 
        Archive a2 = Archive.getInstance(); 
        
        System.out.println(a1);
        System.out.println(a2);
    }
}