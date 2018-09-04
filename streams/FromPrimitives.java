import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream; 

/**
 * FromPrimitives
 * @author @olaven
 */
public class FromPrimitives {
    public static void main(String[] args) {
        // A stream from ints 
        Stream.of(30, 20, 10, 30)
            .forEach(System.out::println); 

        // Stream of ints using IntStream 
        int x = IntStream.range(1, 10)
            .sum();
        System.out.println("Sum of int " + x);  

        // Stream of longs using LongStream 
        long y = LongStream.range(1, 999999L)
            .sum(); 
        System.out.println("Sum of long: " + y);
    }
}