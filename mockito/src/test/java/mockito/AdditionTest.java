package mockito;



import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	Addition obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new Addition();
		x = 7;
		y = 10;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
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
