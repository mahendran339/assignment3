package mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
int x,y;
Calculator obj;
	protected void setUp() throws Exception {
		obj =new Calculator();
		x = 4;
		y = 10;
		ICalculator mockObj = mock(ICalculator.class);
		when(mockObj.addition(x, y)).thenReturn(x+y);
		when(mockObj.subtraction(x, y)).thenReturn(y-x);
		when(mockObj.multiply(x, y)).thenReturn(y*x);
		when(mockObj.divide(x, y)).thenReturn((double)y/(double) x);
		
	obj.setIntObj(mockObj, mockObj);
	}

	protected void tearDown() throws Exception {
		//super.tearDown();
		 x=0;
		 y=0;
		 obj=null;		
	}
	
	public void testAddTwoNums() {
		assertEquals(14, obj.addTwoNums(x, y));
	}
	
	public void testsubTwoNums() {
		assertEquals(6, obj.subTwoNums(x, y));
	}
	public void testdivTwoNums() {
		assertEquals(2.5, obj.divTwoNums(x, y));
	}
	public void testmulTwoNums() {
		assertEquals(40, obj.mulTwoNums(x, y));
	}
}
