import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest
{
	@Test
    public void testCalculate() {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(1, Factorial.calculate(1));
        assertEquals(2, Factorial.calculate(2));
        assertEquals(6, Factorial.calculate(3));
        assertEquals(24, Factorial.calculate(4));
        assertEquals(120, Factorial.calculate(5));
    }

   @Test
    public void testCalculateNegative() 
   {
	   Assertions.assertThrows(IllegalArgumentException.class,()
	   ->Factorial.calculate(-1));
	  // assertEquals(1, Factorial.calculate(-1));
   }
}
