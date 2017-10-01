package mockito;



import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	Calculator obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new Calculator();
		x = 7;
		y = 10;
		ICalculator mockObj = mock(ICalculator.class);
		when(mockObj.addition(x, y)).thenReturn(x+y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(17, obj.addTwoNums(x, y));
	}
}
