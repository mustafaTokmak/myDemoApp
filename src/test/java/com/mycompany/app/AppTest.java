package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Arrays;
import java.util.ArrayList;

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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testSameNumber() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().dividedBy(array, 3, 3));
    }

    public void testNotEqualDivided() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().dividedBy(array, 3, 2));
    }
    public void testEqualDivided() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 8, 9));
      assertTrue(new App().dividedBy(array, 3, 2));
    }
	
    public void testNoDividedElement() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().dividedBy(array, 6, 5));
    }

    public void testNull() {
      assertFalse(new App().dividedBy(null, 1, 2));
    }
}
