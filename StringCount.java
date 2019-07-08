package learning;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class StringCount {

	public static void PrimeOrNot() {
		int n = 5, flag = 0;

		int m = n / 2;

		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("its prime");
		} else {
			System.out.println("its not prime");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeOrNot();

		String str = "Iam testing java";
		/*
		 * char[] ca = str.toCharArray(); LinkedHashMap<Character, Integer> l = new
		 * LinkedHashMap<Character, Integer>(); for (char ch : ca) { if
		 * (l.containsKey(ch)) { l.put(ch, l.get(ch) + 1); } else { l.put(ch, 1); } }
		 * 
		 * System.out.println(l.entrySet());
		 */

		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		for (char c : ch) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);

			} else {
				mp.put(c, 1);
			} 
		}

		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {

			//if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + "" + entry.getValue());
			//}

		}

		// mp.entrySet().stream().filter(entry -> (entry.getValue().intValue()) >
		// 1).forEach(System.out::print);

		/*
		 * Set<Character> uniqueChars = new HashSet<Character>(); Set<Character> repeats
		 * = new HashSet<Character>(); for (int i = 0; i < str.length() - 1; i++) { if
		 * (!uniqueChars.add(str.charAt(i))) { repeats.add(str.charAt(i)); } }
		 */

		/*
		 * String[] arr = str.split(" "); System.out.println(Arrays.asList(arr));
		 * 
		 * List c = new ArrayList<>(); Collections.addAll(c, arr);
		 * 
		 * 
		 * 
		 * for (String string : arr) { System.out.println(string);
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
		 */ }

}
