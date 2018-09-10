/**
 * InsertionSort
 * @author olaven
 */
public class InsertionSort<T extends Comparable> implements Sort<T>{

    public static void main(String[] args) {
        Integer[] array = {1,53,2,12,101,42, 100, 2}; 
        new InsertionSort<Integer>().sort(array); 

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    }

    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j].compareTo(array[j - 1]) < 0) {
                    exchange(j, j - 1, array); 
                }
            }
        }
    }
}