package learning;

public class AbstractTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAre f= new findAre();
		f.triangle(1.0,2.0);

	}

}
abstract class CalcArea{
	public abstract void triangle(double l, double h); 
		
		
	
}
class findAre extends CalcArea{

	@Override
	public void triangle(double l, double h) {
		// TODO Auto-generated method stub
		System.out.println(l*h);
	}
	
}