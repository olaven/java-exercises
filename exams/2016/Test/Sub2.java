public class Sub2 extends Sub1 
{
    public void m1() {
        System.out.println("m1 i sub2");
    }

    public void m2() {
        super.m1(); 
    }
}
