package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

abstract class Demo {
	public void tDemo() {

	}
}

abstract class Demo1 {
	public void tDemo() {

	}
}

class Print_Before_Main extends Demo {

	int a;

	public static int[] sortArray(int[] array) {

		List<Integer> even = new LinkedList<Integer>();
		Map<Integer, Integer> odd = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				odd.put(i, array[i]);
			} else {

				even.add(array[i]);
			}
		}

		Collections.sort(even);

		/*
		 * odd.forEach((k, v) -> { System.out.println(k + " " + v); even.add(k, v); });
		 */

		for (Map.Entry<Integer, Integer> entry : odd.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());
			even.add(entry.getKey(), entry.getValue());
		}

		System.out.println(even.toArray());

		for (int i = 0; i <= even.size(); i++) {
			array[i] = even.get(i);
		}

		return array;
	}

	public String abbreviate(String string) {
		String delimiter = "[^a-zA-Z0-9]";
		Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

		Collections.rotate(Arrays.asList(names), 52);
		System.out.println(Arrays.asList(names));

		// Used to perform case insensitive search of the string
		String[] result = pattern.split(string);
		String str = ",";
		for (String temp : result) {

			int le = temp.length();
			int l = le - 2;

			if (temp.length() > 4) {
				str += temp.substring(0, 1) + temp.valueOf(l) + temp.substring(le - 1, le);

			}
		}
		string = str;

		return "" + Arrays.asList(names);
	}

	void display() {
		System.out.println("test");

		List<Integer> l = new LinkedList<>();
		l.add(2);
		l.add(4);
		l.forEach(e -> System.out.println("for each" + e));
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println("iterator" + it.next());
		}
	}

	public static void fact() {
		int n = 5;
		int f = n;
		for (int i = 1; i < n; i++) {
			f = f * i;
		}
		System.out.println("fact" + f);
	}

	public void leap(int year) {

		System.out.println("member of ckass " + a);
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

	public static void primeNo() {
		int n = 6;
		boolean f = false;
		int l = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("not a prime no");
		} else {
			for (int i = 2; i <= l; i++) {
				if (n % i == 0) {
					f = true;
					System.out.println("not a prime");
					break;
				}

			}
			if (!f) {
				System.out.println("its prime "+n);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Demo s;
		Print_Before_Main s = new Print_Before_Main();
		// Demo d = new Demo();
		// d.display();
		fact();
		List<Integer> li = new ArrayList<>(Arrays.asList(1, 4, 5));

		Integer[] ar = new Integer[li.size()];
		ar = li.toArray(ar);

		for (Integer object : ar) {
			System.out.println(object);
		}

		// s.abbreviate("monolithic_double-barreled");

		int n = 9, low = n / 2;
		/*
		 * boolean isPrime = false;
		 * 
		 * for (int i = 2; i <= low; i++) {
		 * 
		 * if (n % i == 0) { isPrime = true; break; } } if (!isPrime) {
		 * System.out.println("is Prime"); } else { System.out.println("is not prime");
		 * }
		 */

		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
