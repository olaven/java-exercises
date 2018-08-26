/**
 * StackTest
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); 

        stack.push(1); 
        stack.push(2); 
        stack.push(3); 

        int lastAdded = stack.pop(); 

        System.out.println("3 was added last, therefore removed first in a stack: " + lastAdded); 

        stack.pop(); 
        int firstAdded = stack.pop(); 
        System.out.println("1 was added first, therefore removed last in a stack: " + firstAdded);

    }
}