/**
 * InsertionSort
 * @author olaven
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
        for (int i = 0; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j].compareTo(array[j - 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array; 
    }
}