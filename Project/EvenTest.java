import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenTest {

    @Test
    public void testEven(){
        
      assertEquals(2,Even.EvenT(2));

}
    @Test
	public void testOdd()
	{
		assertEquals(1,Even.EvenT(4));
	}

}