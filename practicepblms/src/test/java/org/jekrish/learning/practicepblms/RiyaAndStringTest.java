package org.jekrish.learning.practicepblms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RiyaAndStringTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RiyaAndStringTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RiyaAndStringTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testRiyaAndString5()
    {
    	//input length - 5
        String actualoutput = RiyaAndStrings.process("cbdae");
        String expectedoutput = "abcde";
        assertEquals(actualoutput, expectedoutput);
    }
    
    public void testRiyaAndString4()
    {
    	//input length - 4
        String actualoutput = RiyaAndStrings.process("xlri");
        String expectedoutput = "rxli";
        assertEquals(actualoutput, expectedoutput);
    }
    
    public void testRiyaAndString3()
    {
    	//input length - 3
        String actualoutput = RiyaAndStrings.process("cid");
        String expectedoutput = "icd";
        assertEquals(actualoutput, expectedoutput);
    }
    
    public void testRiyaAndString2()
    {
    	//input length - 2
        String actualoutput = RiyaAndStrings.process("jk");
        String expectedoutput = "jk";
        assertEquals(actualoutput, expectedoutput);
    }
    
    public void testRiyaAndString1()
    {
    	//Min input length - 1
        String actualoutput = RiyaAndStrings.process("j");
        String expectedoutput = "j";
        assertEquals(actualoutput, expectedoutput);
    }
    
    public void testRiyaAndStringWithSpaces()
    {
    	//with spaces
        String actualoutput = RiyaAndStrings.process("  ab  ");
        String expectedoutput = " a  b ";
        assertEquals(actualoutput, expectedoutput);
    }
}
