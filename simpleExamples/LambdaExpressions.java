import java.util.ArrayList; 

public class LambdaExpressions
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); 

        list.add("Olav"); 
        list.add("Thomas"); 
        list.add("Tord"); 

        // This is a lambda expression
        list.forEach(value -> System.out.println(value)); 
    }
}