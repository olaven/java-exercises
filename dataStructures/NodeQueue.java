public class NodeQueue<T> { 

    public static void main(String[] args) {
        NodeQueue<String> queue = new NodeQueue<String>(); 
        
        queue.enqueue("first");
        queue.enqueue("second");

        System.out.println("Expect first: " + queue.dequeue()); 
        System.out.println("Expect second: " + queue.peek() + " from peek");
        System.out.println("Expect second: " + queue.dequeue()); 

        try {
            queue.dequeue(); 
        } catch (Exception e) {
            System.out.println("exception cautht when queueing empty"); 
        }
        try {
            queue.peek();
        } catch (Exception e) {
            System.out.println("exception cautht when peeking empty");
        }
    }

    private class Node<T> {
        T value; 
        Node<T> next; 
    }

    private Node<T> front; 
    private Node<T> back; 

    public void enqueue(T value) {
        Node<T> node = new Node<T>(); 
        node.value = value; 

        if(front == null) {
            front = node; 
            back = node; 
            return; 
        }

        back.next = node; 
        back = node; 
    }

    public T dequeue() {
        if(back == null) {
            throw new RuntimeException(); 
        }

        T value = front.value; 
        front = front.next; 

        return value; 
    }

    public T peek() {
        if(front == null) {
            throw new RuntimeException(); 
        }

        return front.value; 
    }
}