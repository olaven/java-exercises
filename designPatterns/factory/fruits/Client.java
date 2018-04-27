import java.io.FilterInputStream;
import java.util.ArrayList; 

public class Client{
    public static void main(String[] args){
        ArrayList<Fruit> fruits = new ArrayList<Fruit>(); 
        
        fruits.add(FruitFacory.getFruit("apple")); 
        fruits.add(FruitFacory.getFruit("banana")); 
        fruits.add(FruitFacory.getFruit("orange")); 
        
        for(Fruit fruit : fruits){
            System.out.println(fruit.toString()); 
        }
    }
}