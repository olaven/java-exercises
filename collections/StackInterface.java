/**
 * InnerStackInterface
 */
public interface StackInterface<T> extends CollectionInterface{
    /**
     * Push element on top of stack 
     */
    public void push(T element); 

    /**
     * Pop element of stack 
     */
    public void pop(); 
}