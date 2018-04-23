import java.util.ArrayList; 
/**
 * NamesList
 * Holds a list and lets the user get an element from it 
 */
public class NamesList {
    ArrayList<String> list; 
    
    public NamesList(){
        this.list = new ArrayList<String>(); 
        list.add("James"); 
        list.add("Oliver"); 
        list.add("Simon");  
    }

    public String getItemAt(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index >= list.size()){
            throw new IndexOutOfBoundsException(); 
        } else {
            return list.get(index); 
        }
    }
}