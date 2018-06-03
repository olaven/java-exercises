public class Client
{
    public static void main(String[] args) {
        Super sup = new Super(); 
        Sub sub = new Sub(); 
        
        sup.sayHi(); 
        sub.sayHi(); 
    }
}