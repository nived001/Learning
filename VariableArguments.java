package learning;

public class VariableArguments {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		System.err.println(avga(10, 20,30));
	}

	public static int avga(int... numb) {
		int total = 0;
		for (int a : numb)
			total += a;
		return total / numb.length;
	}
}
