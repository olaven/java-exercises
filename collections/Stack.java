/**
 * Stack
 */
public class Stack<T> {
    /**
     * I want Node to keep track of both the next and the 
     * previous Node. Therefore, I am making my own version 
     * specific for the stack 
     */
    private class Node<T> {
        T value; 
        Node<T> previous; 
    }
    
    Node<T> top;
    int size; 

    public Stack() {
        size = 0; 
    }
    
    public void push(T element) {
        size++; 

        Node<T> node = new Node(); 
        node.value = element; 

        if(top == null) {
            top = node; 
            return; 
        }

        node.previous = top; 
        top = node;         
    }

    public T pop() {

        if(top == null) 
            return null; 


        T element = top.value; 
        top = top.previous; 

        return element; 
    }

    public boolean isEmpty() {
        return (top == null); 
    }

    public int size() {
        return size;  
    }
}