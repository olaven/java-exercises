/**
 * Bubblesort
 * @author olaven
 */
public class BubbleSort<T extends Comparable> {

    public static void main(String[] args) {
        Integer[] array = {1, 4, 3, 5, 66, 23, 1}; 
        array = (Integer[]) BubbleSort.sort(array); 

        for(Integer num : array) {
            System.out.print(num + " "); 
        }

        System.out.println(); 
    }
 
    public static Comparable[] sort(Comparable[] array) {
        boolean swapped = true; 
        while(swapped) {          
            swapped = false; 
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i].compareTo(array[i + 1]) > 0) {
                    array = BubbleSort.exchange(i, i + 1, array); 
                    swapped = true; 
                }
            }
        }
        
        return array; 
    }

    private static Comparable[] exchange(int i, int j, Comparable[] array) {
        Comparable temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 

        return array; 
    }
} 