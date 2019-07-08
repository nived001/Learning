package learning;

import java.util.Scanner;

interface c extends a, b {

}

public class Factorial{

	public Object add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;
		}
		System.out.println(f);
	}

}
