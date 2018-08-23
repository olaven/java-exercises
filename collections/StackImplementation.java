/**
 * StackImplementation
 */
public class StackImplementation<T> implements StackInterface<T>{
    /**
     * I want Node to keep track of both the next and the 
     * previous Node. Therefore, I am making my own version 
     * specific for the stack 
     */
    private class Node<T> {
        T value; 
        Node next; 
        Node previous; 
    }
    
    Node top;
    int size; 

    public StackImplementation() {
        size = 0; 
    }
    
    public void push(T element) {
        size++; 

        Node newNode = new Node(); 
        newNode.value = element; 

        if(top == null) {
            top = newNode; 
        }

        top.next = newNode; 
        top.previous = top; // pointing to itself 
        top = newNode;      // new top => not self-pointing
    }

    public void pop() {
        top.previous = top; 
        /* 
        the top before pop() is no 
        longer referenced, and the 
        garbage collector will handle 
        the rest for me
        */
    }

    public boolean isEmpty() {
        return (top == null); 
    }

    public int size() {
        return size;  
    }
}