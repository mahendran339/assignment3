package mockito;

public class Addition {
	CalcInterface intObj;

	public int addTwoNums(int a, int b) {
		
		return intObj.add(a, b);
	}

	public void setIntObj(CalcInterface mockObj, CalcInterface intObj) {
	this.intObj =intObj;
}

}