package calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }

    public void testAdd() 
    {
        Calculator c = new Calculator();

        assertTrue(c.add(3, 2) == 5);
    }

    public void testSubtract()
    {
        Calculator c = new Calculator(); 

        assertTrue(c.subtract(3, 2) == 1); 
    }

    public void testMultiply() 
    {
        Calculator c = new Calculator();

        assertTrue(c.multiply(3, 2) == 6);
    }

    public void testDivide() 
    {
        Calculator c = new Calculator();

        assertTrue(c.divide(3, 2) == 1.5);
    }
}
