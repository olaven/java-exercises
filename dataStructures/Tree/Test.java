/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        BinaryTreeMap<String, String> map = new BinaryTreeMap(); 

        String[][] keyValues = new String[][]
        {
            {"nøkkel", "verdien"}, 
            {"Olav", "Guro"}, 
            {"Elon", "Ball"}, 
            {"this is", "something"}
        }; 

        for (int i = 0; i < keyValues.length; i++) {
            System.out.println(keyValues[i][0] + " - " + keyValues[i][1]); 
        }
    }
}