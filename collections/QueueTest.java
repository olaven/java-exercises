/**
 * Test
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(); 

        queue.enqueue(1); 
        queue.enqueue(2);
        queue.enqueue(3);

        int first = queue.dequeue(); 

        System.out.println("1, since 1 was added first: " + first); 

        queue.dequeue();
        int last = queue.dequeue();

        System.out.println("3, since 3 was added last: " + last);
    }
}