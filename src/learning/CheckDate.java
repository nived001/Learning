package learning;

import java.text.DateFormat;
import java.util.Date;

interface a {

}

interface ab {

}

interface bc extends a, ab {

}

public class CheckDate {

	public int port(int a) {
		return a;
	}

	public float port(int a, int b) {
		return a;
	}

	public void test(int a) {

		System.out.println("static method" + a);
		return;
	}

	static void testing(float g) {
		System.out.println("static method");

	}

	static void testing(int b, int c) {

		System.out.println(b + "static" + c);
	}

	int as = 10;

	public Object ram(int a) {
		System.out.println("concreate");
		return 0;
	}

	public void rams(int b, int c) {
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 10; System.out.println("times" + i), i++)
			;
		CheckDate cd = new CheckDate();

		// test(10);
		testing(5, 7);
		cd.ram(1);
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(java.time.LocalDate.now());
		String form = DateFormat.getInstance().format(dt);
		System.out.println(form);
	}

}
