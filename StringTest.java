/** Import necessary libraries for JUnit */
import java.lang.String;
import org.junit.Test;

/** Class to test methods length, charAt, substring, and indexOf */
public class StringTest {
	@Test
    public void main() {
        /** Creating a sample string to test */
        String testString = "This is a test string.";

        /** Using length method to print out number of characters in testString */
        System.out.println(testString.length());

        /** Using charAt method to print out the character at index 6 */
        System.out.println(testString.charAt(6));

        /** Using substring method to print out a new string starting at index 2 and ending at index 5 */
        System.out.println(testString.substring(2, 5));
        
        /** Using indexOf method to print out the index number the word 'test' starts at */
        System.out.println(testString.indexOf("test"));
    }

}
