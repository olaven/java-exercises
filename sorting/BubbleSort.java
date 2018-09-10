/**
 * Bubblesort
 * @author olaven
 */
public class BubbleSort<T extends Comparable> implements Sort<T>{

    public static void main(String[] args) {
        Integer[] array = {1, 4, 3, 5, 66, 23, 1};
        new BubbleSort<Integer>().sort(array); 
        for(Integer num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public void sort(T[] array) {
        boolean swapped; 
        do {
            swapped = false; 
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    exchange(i, i + 1, array); 
                    swapped = true; 
                }
            }
        } while (swapped);
    }
}
