package learning;

import java.util.*;
import java.util.LinkedHashMap;

public class Dog {

	public static void concat1(String s1) {
		s1 = s1 + "forgeeks";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("forgeeks");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("forgeeks");
	}

	public void bark() {
		System.out.println("Dog bark");
	}

	public static void main(String args[]) {
		

		LinkedHashMap<Character, Integer> a = new LinkedHashMap<>();

		String str = "tes tin ging";
		

		 

		String b1 = str.replace(" ", "");
		
		Set<Character> charSet = new LinkedHashSet<Character>();

		char[] stra = b1.toCharArray();
		
		/*for (char c : stra) {
			charSet.add(c);
		}
		System.out.println(charSet.toString());
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());*/
		
		for (char c : stra) {
			if (a.containsKey(c)) {
				a.put(c, a.get(c) + 1);
			} else {
				a.put(c, 1);
			}
		}

		System.out.println(a.entrySet());
		// Printing the charCountMap

	}
}
