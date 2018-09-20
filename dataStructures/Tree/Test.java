import java.util.Random;
/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Random random = new Random(); 
        BinaryTreeMap<Integer, String> map = new BinaryTreeMap(); 


        int amount = 10000; 
        for (int i = 0; i < amount; i++) {
            map.put(i, "random value: " + random.nextInt(200)); 
        }
        System.out.println("All items added"); 
        System.out.println(map.get(amount / 2)); 
    }
}