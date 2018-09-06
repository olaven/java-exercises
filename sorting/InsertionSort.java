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

    public static <T extends Comparable> T[] sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = i; 
            while((current - 1) > 0 && less(array[current], array[current - 1])) {
                exchange(current, (current - 1), array); 
                current --; 
            }
        }

        return array; 
    }

    /**
     * @param first first paramter
     * @param second second parameter
     * @return true if first is less, false if not 
     */
    public static boolean less(Comparable first, Comparable second) {
        boolean less = first.compareTo(second) < 0; 
        return less; 
    }

    /**
     * Exchanges elements at given positions
     * @param i index of first element
     * @param j index of second element
     * @param array array to exchange inside 
     * @return the array with exchanged arrays 
     */
    public static<T extends Comparable> T[] exchange(int i, int j, T[] array) {
        T temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 

        return array; 
    }
}

