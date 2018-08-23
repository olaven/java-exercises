/**
 * QueueInterface
 */
public interface QueueInterface extends CollectionInerface{
    /**
     * add element at end of queue
     */
    public void enqueue(); 

    /**
     * remove element from beginning of queue
     */
    public void dequeue(); 
}