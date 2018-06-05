public class Client
{
    public static void main(String[] args)
    {
        SuperClass sup = new SuperClass(); 
        SuperClass sub1 = new Sub1(); 
        SuperClass sub2 = new Sub2(); 

        sup.m1(); 
        sup.m2(); 
        sub1.m1(); 
        sub1.m2(); 
        sub2.m1(); 
        sub2.m2(); 
    }
}