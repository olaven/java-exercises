import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream; 

/**
 * ObjectAndPrimitiveStreams
 * @author @olaven
 */
public class ObjectAndPrimitiveStreams {
    public static void main(String[] args) {
        // Object stream to int  
        Stream.of("a1", "b2", "c3")
            .map(s -> s.substring(1)) // getting the number 
            .mapToInt(Integer::parseInt) // parse all to ints 
            .average() // get the average 
            .ifPresent(System.out::println); 
        
        // int stream to Object stream 
        IntStream.range(1, 4)
            .mapToObj(i -> "myString" + i)
            .forEach(System.out::println); 

        // double stream -> int stream -> object stream 
        Stream.of(2.0, 5.0, 10.0)
            .mapToInt(Double::intValue)
            .mapToObj(i -> i + " string from double.")
            .forEach(System.out::println); 
    }
}