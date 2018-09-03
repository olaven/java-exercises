import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] array = { 1, 4, 103, 3, 6, 2, 6, 5, 66, 23, 1 };
        array = (Integer[]) BubbleSort.sort(array);

        for (Integer num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static Comparable[] sort(Comparable[] array) {
        if(array.length <= 1) 
            return array; 

        for (int i = 1; i < array.length; i++) {
            // loop back again and swap elemens 
            for(int j = i; j >= 0; j--) {
                if(array[i].compareTo(array[j]) <= 1) 
                    array = InsertionSort.exchange(i, j, array); 
            }
        }
        return null; 
    }

    private static Comparable[] exchange(int i, int j, Comparable[] array) {
        Comparable temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
        return array; 
    }
}