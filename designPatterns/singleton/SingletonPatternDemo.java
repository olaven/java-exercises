/**
 * SingletonPatternDemo
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        
        SingleObject object = SingleObject.getInstance(); 
        object.showMessage(); //is the same instance 
        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage(); //is the same instance  

        System.out.println("Are the objects the same?"); 
        System.out.println(object.hashCode() == object2.hashCode()); 

    }
}