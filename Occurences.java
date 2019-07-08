package learning;

import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		final int MAX_CHAR = 256;
		String str = "testing";
		// TODO Auto-generated method stub
		/*
		 * String s = "abdsd3$asda$asasdd$sadas"; int counter = 0; for (int i = 0; i <
		 * s.length(); i++) { if (s.charAt(i) == '$') { counter++; } }
		 * System.out.println(counter);
		 */

		/*
		 * Scanner s = new Scanner(System.in); System.out.println("enter a string");
		 * String str = s.nextLine(); int c = 0; char[] strArray = str.toCharArray();
		 * for (int i = 0; i < strArray.length; i++) { for (int j = 0; j <
		 * strArray.length; j++) { if (strArray[i] == strArray[j]) { c++; } }
		 * System.out.printf("%s :", strArray[i]); System.out.printf("%d\n", c); c = 0;
		 * }
		 */
		/*
		 * int count[] = new int[MAX_CHAR];
		 * 
		 * int len = str.length();
		 * 
		 * // Initialize count array index for (int i = 0; i < len; i++)
		 * count[str.charAt(i)]++;
		 * 
		 * // Create an array of given String size char ch[] = new char[str.length()];
		 * for (int i = 0; i < len; i++) { ch[i] = str.charAt(i); int find = 0; for (int
		 * j = 0; j <= i; j++) {
		 * 
		 * // If any matches found if (str.charAt(i) == ch[j]) find++; }
		 * 
		 * if (find == 1) System.out.println("Number of Occurrence of " + str.charAt(i)
		 * + " is:" + count[str.charAt(i)]);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
/*
		int[] count = new int[MAX_CHAR];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			 ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (ch[j] == str.charAt(i))
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);

		}*/
		String a1="test";
		String a2= "etst2";
		boolean s1= a1 instanceof String;
	//	boolean s2= a2  instanceof a1;
		boolean s3 = a1 instanceof Object;
		boolean s4= args instanceof Object;
		boolean s5= args instanceof String[];
		
			
		System.out.println(s1+"" +s3+" "+s4+""+s5 );

	}

}
