import java.util.List; 
import java.util.ArrayList;

/**
 * Example
 * @author @olaven
 */
public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Elon");
        list.add("Eske");
        list.add("Hund");
        list.add("Flaske");
        // List is a Collection and Collections support Streams
        list
            .stream()
            .filter(s -> s.startsWith("E"))
            .forEach(System.out::println);

        
        // Streams represent sequences
        // One may perform operations on those sequences
        // Methods on stream are either intermediate or terminal 
        // Intermediate -> returns a new stream 
        // Terminal -> returns a non-stream value 
    }
}