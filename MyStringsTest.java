import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStringsTest.
 *
 * @author  Dave Avis
 * @version 9.26.2018
 */
public class MyStringsTest
{
    /**
     * Default constructor for test class MyStringsTest
     */
    public MyStringsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Test swapWords()
     */
    @Test
    public void swapWordsTest()
    {
        String[] input = { "A string", "Master Commander", "Roger Roger", "Ricky Bobby" };
        String[] expected = { "string A", "Commander Master", "Roger Roger", "Bobby Ricky" };
        
        for( int i = 0; i < input.length; i++ )
        {
            assertEquals( "swapWords() failed: ", expected[i], MyStrings.swapWords( input[i] ) );
        }
    }
    
    /**
     * Test firstLast()
     */
    @Test
    public void firstLastTest()
    {
        String[] input = { "A string", "Master Commander", "Roger Roger", "Ricky Bobby" };
        String[] expected = { "Ag", "Mr", "Rr", "Ry" };
        
        for( int i = 0; i < input.length; i++ )
        {
            assertEquals( "firstLast(\"" + input[i] + "\") failed: ", expected[i], MyStrings.firstLast( input[i] ) );
        }
    }
    
    /**
     * Test findLetter()
     */
    @Test
    public void findLetterTest()
    {
        String[] inputStr = { "A long string of words", "Stratford", "Computer Science", "Testing Testing 1 2 3" };
        char[] inputChar = { 'i', 'a', 'z', '2' };
        boolean[] expected = { true, true, false, true };
        
        for( int i = 0; i < inputStr.length; i++ )
        {
            assertEquals( "findLetter(\"" + inputStr[i] + "\", \'" + inputChar[i] + "\') failed: ", expected[i], MyStrings.findLetter( inputStr[i], inputChar[i] ) );
        }
    }
    
    /**
     * Test findString()
     */
    @Test
    public void findStringTest()
    {
        String[] inputStr = { "A long string of words", "Stratford", "Computer Science", "Testing Testing 1 2 3" };
        String[] inputToFind = { "str", "tfor", "here", "T" };
        boolean[] expected = { true, true, false, true };
        
        for( int i = 0; i < inputStr.length; i++ )
        {
            assertEquals( "findString(\"" + inputStr[i] + "\", \'" + inputToFind[i] + "\') failed: ", expected[i], MyStrings.findString( inputStr[i], inputToFind[i] ) );
        }
    }
    
    /**
     * Test numOfLetter()
     */
    @Test
    public void numOfLetterTest()
    {
        String[] inputStr = { "A long string of words", "Stratford", "Computer Science", "Testing Testing 1 2 3" };
        char[] inputChar = { 'A', 't', 'z', 'T' };
        int[] expected = { 1, 2, 0, 2 };
        
        for( int i = 0; i < inputStr.length; i++ )
        {
            assertEquals( "numOfLetter(\"" + inputStr[i] + "\", \'" + inputChar[i] + "\') failed: ", expected[i], MyStrings.numOfLetter( inputStr[i], inputChar[i] ) );
        }
    }
    
    /**
     * Test numOfString()
     */
    @Test
    public void numOfStringTest()
    {
        String[] inputStr = { "A long string of words", "Stratford", "Computer Science", "Testing Testing 1 2 3" };
        String[] inputToFind = { "str", "tfor", "here", "Tes" };
        int[] expected = { 1, 1, 0, 2 };
        
        for( int i = 0; i < inputStr.length; i++ )
        {
            assertEquals( "numOfString(\"" + inputStr[i] + "\", \'" + inputToFind[i] + "\') failed: ", expected[i], MyStrings.numOfString( inputStr[i], inputToFind[i] ) );
        }
    }
}
