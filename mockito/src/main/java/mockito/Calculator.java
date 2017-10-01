package mockito;

public class Calculator {

	ICalculator interfaceObj;

	public int addTwoNums(int a, int b) {		
		return interfaceObj.addition(a, b);
	}
	
	public int subTwoNums(int a, int b) {		
		return interfaceObj.subtraction(a, b);
	}

	public double divTwoNums(int a, int b) {		
		return interfaceObj.divide(a, b);
	}
	
	public int mulTwoNums(int a, int b) {		
		return interfaceObj.multiply(a, b);
	}
	
	public void setIntObj(ICalculator mockObj, ICalculator interfaceObj) {
	this.interfaceObj = interfaceObj;
}
		
}
