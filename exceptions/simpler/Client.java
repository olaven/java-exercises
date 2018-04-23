import java.util.ArrayList;

public class Client{
    public static void main(String[] args) {
        NamesList namesList = new NamesList(); 
        
        //Will work 
        try {
            String name = namesList.getItemAt(0);
            System.out.println(name);  
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This index is not in the list!"); 
        }

        //Will NOT work - NamesList contains 3 (2 index) names
        try {
            String name = namesList.getItemAt(3);
            System.out.println(name);   
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This index is not in the list!"); 
        }
    }
}