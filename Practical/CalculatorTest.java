import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test	
	public void testAdd()
	{
		Calculator cal=new Calculator();
		int result=cal.add(4,5);
		assertEquals(9,result);
	}
	
	@Test
	public void testSubtract()
	{
		Calculator cal=new Calculator();
		int result=cal.subtract(5,3);
		assertEquals(2,result);
	}

}
