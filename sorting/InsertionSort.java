/**
 * InsertionSort
 * @author olaven
 */
/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] array = {1,53,2,12,101,42, 100, 2}; 
        array = (Integer[]) InsertionSort.sort(array); 

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    }

    public static<T extends Comparable> T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = i; 
            while(key > 0 && array[key - 1].compareTo(array[key]) >= 1) {
                T temp = array[key]; 
                array[key] = array[key - 1]; 
                array[key - 1] = temp; 
            }
        }
        return array; 
    }
}