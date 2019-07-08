package learning;

interface a {

}

interface b {

}

public class ArraysExample implements a, b {
//add strings
	public String add(String a, String b) {
		return a + b;
	}

//addition of 2 integers
	public int add(int a, int b) {
		return a + b;
	}

	// addition of 3 integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1.23;
		/*
		 * int bc[] = { 6, 2, 3, 4, 1, 5 }; for (int i = 0; i < bc.length; i++) { int j;
		 * for (j = 0; j < i; j++) if (bc[i] == bc[j]) break; if (i == j)
		 * System.out.println(bc[i]+" "+d); } int x = 10; int y = -x; int z= x++; int k
		 * = ++x;
		 * 
		 * 
		 * 
		 * System.out.println("x"+x); System.out.println("y"+y);
		 * System.out.println("z"+z); System.out.println(k);
		 */

		String str = "madam";
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {

			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (ch[j] == str.charAt(i))
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);

		}

	}

}
