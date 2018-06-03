public class Client {
    public static void main(String[] args) {
        int[] array = new int[1]; 
        try {
            // this throws an exception
            System.out.println(array[1]); //INDEX OUT OF BOUNDS 
            System.out.println("This should not run"); 
        } catch (Exception e) {
            System.out.println("First exception."); 
        }

        System.out.println("This will run, as it is not affected by exception throwing."); 

        try {
            // this throws an exception
            System.out.println(array[1]); // INDEX OUT OF BOUNDS
            System.out.println("This should not run");
        } catch (Exception e) {
            System.out.println("Second exception.");
        }
    }
}