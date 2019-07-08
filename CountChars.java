package learning;

import java.util.*;

public class CountChars {

	public int getCount(String text, char character) {
		int count = 0;
		/*List<Integer> x = new ArrayList<Integer>();
		int[] ab = new int[] { 2, 5, 3, 2, 5, 2 };

		for (int i = 0; i < ab.length; i++) {
			for (int j = i + 1; j < ab.length; j++) {
				if (ab[i] == ab[j]) {
					x.add(j);
				}

			}
		}
		System.out.println(x);
		System.out.println(Collections.min(x));
*/
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				count++;
			}/* else {
				System.out.println("not available");
				break;
			}*/

		}
		return count; 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountChars c = new CountChars();

		System.out.println(c.getCount("testing", 't'));
	}

}
