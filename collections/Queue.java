/**
 * QueueImplementation
 */
public class Queue<T> {
    private Node<T> head; 
    private Node<T> tail; 
    private int size = 0; 

    public void enqueue(T element) {
        size++; 
        
        Node<T> node = new Node<T>(); 
        node.value = element; 

        if(head == null) {
            head = node; 
            tail = node; 
            return; 
        }

        tail.next = node; 
        node.previous = tail; 
        tail = node; 
    }   
    
    public T dequeue() {
        size--; 

        T element = head.value; // will be returned after clearing up pointers
        head = head.next; 

        return element; 
    }

    public int size() {
        return size; 
    }

    public boolean isEmpty() {
        return size == 0; 
    }
}