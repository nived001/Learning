package learning;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public void display() {

		String[] symbols = new String[1];

		symbols[0] = "test";
		System.out.println("A1 class method" + symbols[0].toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.display();
	}

}
