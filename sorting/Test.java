/**
 * Test
 * @author olaven
 */
public class Test {

    public static void main(String[] args) {        
        Test.run("Bubble Sort", new BubbleSort<>()); 
        Test.run("Insertion Sort", new InsertionSort<>()); 
        Test.run("Merge Sort", new MergeSort<>());
        Test.run("Quick Sort", new QuickSort<>());

    }

    public static void run(String testName, Sort sorter) { 

        String[] array = {"c", "a", "f", "a", "fb", "df", "da", "fa"}; 
        sorter.sort(array); 

        System.out.println(testName + " - test:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            System.out.print(array[i]); 
        }
        System.out.println(); 
    }
}