import java.util.Arrays; 

/**
 * MergeSort
 * @author olaven
 */
public class MergeSort<T extends Comparable> implements Sort<T> {

    public void sort(T[] array) {
       array = mergeSort(array); 
    }

    public T[] mergeSort(T[] array) {

        if (array.length <= 1)
            return array;

        T[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        T[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        mergeSort(left);
        mergeSort(right);

        return merge(left, right);
    }

    private T[] merge(T[] left, T[] right) {
        Comparable[] result = new Comparable[left.length + right.length]; 
        int leftCounter = 0; 
        int rightCounter = 0; 
        int resultCounter = 0; 

        while(leftCounter < left.length && rightCounter < right.length) {
            if (left[leftCounter].compareTo(right[rightCounter]) < 0) {
                result[resultCounter] = left[leftCounter];
                
                leftCounter++;  
                resultCounter++; 
            } else {
                result[resultCounter] = right[rightCounter];

                rightCounter++; 
                resultCounter++; 
            }
        }

        if (leftCounter < left.length) {
            for (int i = leftCounter; i < left.length; i++) {
                result[resultCounter] = left[leftCounter]; 
                resultCounter++; 
            }
        }

        if (rightCounter < right.length) {
            for (int i = rightCounter; i < right.length; i++) {
                result[resultCounter] = right[rightCounter];
                resultCounter++;
            }
        }

        return (T[]) result; 
    }

}