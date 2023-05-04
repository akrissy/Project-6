/** Import necessary libraries for JUnit */
import org.junit.Test;
import static org.junit.Assert.*;

/** Test class for PrimeNumberMethod class */
public class PrimeNumberMethodTest {

/** Test method to test isPrime method in PrimeNumberMethod class */
  @Test
  public void testIsPrime() {
	  
	/** Testing prime numbers to check if isPrime method identifies the numbers correctly */
    assertTrue(PrimeNumberMethod.isPrime(2)); /** Calling isPrime method from PrimeNumberMethod class with a prime number argument */
    assertTrue(PrimeNumberMethod.isPrime(3));
    assertTrue(PrimeNumberMethod.isPrime(5));
    assertTrue(PrimeNumberMethod.isPrime(7));
    
    /** Testing composite numbers to check if isPrime method identifies the numbers correctly */
    assertFalse(PrimeNumberMethod.isPrime(4)); /** Calling isPrime method from PrimeNumberMethod class with a composite number argument */
    assertFalse(PrimeNumberMethod.isPrime(6));
    assertFalse(PrimeNumberMethod.isPrime(8));
    assertFalse(PrimeNumberMethod.isPrime(9));
  }
}
