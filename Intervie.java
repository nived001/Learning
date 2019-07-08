package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intervie implements Runnable {
	int ab;

	public void run() {

		System.out.println("In run" + ab);
		throw new RuntimeException("som eprib");
	}

	public static void main(String[] args) {

		String av = "4,2,1,5";
		System.out.println(av);

		// List<String> b = Arrays.asList(av);
		// System.out.println(b);

		String[] ar = av.split(",");

		int len = ar.length;

		List<String> b = new ArrayList();

		for (String string : ar) {
			b.add(string);
		}

		Collections.sort(b);

		StringBuilder sb = new StringBuilder();
		
		for (String character : b) {
			sb.append(character);
		}

		for (int i = 1; i < av.length(); i++) {
			System.out.print(sb.charAt(i + 1) + ",");

		}

		System.out.println(sb.toString()); 

		// System.out.println(b.toString());
		/*
		 * Thread t1= new Thread(new Intervie()); t1.start();
		 * System.out.println("end of main");
		 */
		/*
		 * // TODO Auto-generated method stub String a = "4,2,1,5";
		 * 
		 * String[] ar = a.split(","); int len = ar.length; List<String> b = new
		 * ArrayList();
		 * 
		 * 
		 * System.out.println(len); //System.a
		 * 
		 * int i = 0; for (i = 0; i < len; i++) { b.add(ar[i]); //
		 * System.out.print(b[i]);
		 * 
		 * } Collections.sort(b);
		 * 
		 * int temp=0; for(i=0;i<len;i++) { for(int j=1;j<len;j++) { if(b[j-1]>b[j]) {
		 * temp=b[j-1]; b[j-1]=b[j]; b[j]=temp; } } }
		 * 
		 * 
		 * 
		 * String strArray[] = new String[b.length]; for (i = 0; i < b.length; i++) {
		 * 
		 * strArray[i] = String.valueOf(b[i]);
		 * 
		 * 
		 * }System.out.println(Arrays.toString(strArray));
		 * 
		 * 
		 * String ag = "" + b[0] + "," + b[1] + "," + b[2] + "," + b[3];
		 * 
		 * System.out.println(" "); //System.out.println(Arrays.toString(b));
		 * Arrays.sort(b); for (i = 0; i < len; i++) {
		 * 
		 * System.out.print(b[i] + ","); // System.out.print(b[i]);
		 * 
		 * } System.out.println(a); System.out.println(b.toString());
		 * 
		 * }
		 */
	}

}
