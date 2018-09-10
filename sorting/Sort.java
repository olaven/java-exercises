/**
 * Sort
 */
public interface Sort<T extends Comparable> {

    public void sort(T[] array); 

    public default void exchange(int i, int j, T[] array) {
        T temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
    }
}