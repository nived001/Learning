package learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.naming.InterruptedNamingException;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.poi.util.SystemOutLogger;

import com.google.common.io.Files;

interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)

	public static final int i = 10;
}

public class Stringpalin {

	public static boolean isTriangle(int a, int b, int c) {
		boolean s = false;
		if (a > 0 && b > 0 && c > 0)
			s = true;
		else
			s = false;
		return s;

	}

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {

		int l = binary.size();

		int b = 0, j = 0;
		for (int i = l - 1; i >= 0; i--) {

			b += binary.get(i) * Math.pow(2, j);
			j = j + 1;
		}

		return b;
		// Your Code
	}

	public void p() {
		int p0 = 1000, in = 50, r = 2;
		int i = 0;
		do {
			p0 += (p0 * r / 100) + 50;
			i = i + 1;
		} while (p0 < 1200);
		System.out.println(i);
	}

	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> s = new LinkedHashSet<>();
		String[] a1 = { "arp", "live", "strong" };
		String[] a2 = { "lively", "alive", "harp", "sharp", "armstrong" };

		for (String string : a1) {
			for (String string2 : a2) {
				if (string2.contains(string)) {
					s.add(string);
				}

			}

		}
//
		// String[] tem = new HashSet<String>(Arrays.asList(a1)).toArray(new String[0]);
		String[] aa = a1.clone();
		aa.toString();
		// Collections.addAll(s, aa);
		// System.out.println(Arrays.toString(aa));
		return new String[] {};

	}

	public String spinWords(String sentence) {
		String res = "";
		String tem = "";
		String[] word = sentence.split(" ");

		String sf = "";
		for (int i = 0; i < word.length; i++) {
			sf = word[i];

			if (sf.length() >= 5) {

				for (int j = sf.length() - 1; j >= 0; j--) {
					res += sf.charAt(j);
				}
				word[i] = res;
				res = "";
			}

		}

		for (String string : word) {
			tem += " " + string;
		}

		return tem.trim();

	}

	public static String createPhoneNumber(int[] numbers) {

		// String str = "(" + a[0] + a[1] + a[2] + ")" + " " + a[3] + a[4] + a[5] + "-"
		// + a[6] + a[7] + a[8] + a[9] + "";

		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
				numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);

	}

	public static int digital_root(int n) {

		System.out.println("asgdasdgasg" + 5 / 60);

		/*
		 * String temp = Integer.toString(n);
		 * 
		 * int[] newGuess = new int[temp.length()]; for (int i = 0; i < temp.length();
		 * i++) { newGuess[i] = temp.charAt(i) - '0'; }
		 * 
		 * for (int j = 0; j < newGuess.length; j++) { sum += newGuess[j]; } res = sum;
		 * 
		 * String a = Integer.toString(sum); int l = a.length(); if (l >= 2) {
		 * 
		 * digital_root(sum); }
		 */
		int temp = 0, res = 1;
		if (n > 9) {
			do {
				temp = (n % 10);
				n = n / 10;
				res = res * temp;
			} while (n > 0);
		} else {
			n = 0;
		}

		return (n);

	}

	public static String Tickets(int[] peopleInLine) {

		String a = "";
		/*
		 * for (int i = 1; i < peopleInLine.length; i++) {
		 * 
		 * if ((peopleInLine[i]) / (peopleInLine[0]) <= 2) { str = "YES"; } else { str =
		 * "false"; } // Your code is here... }
		 */
		int i, sum = 0, change = 0;
		for (i = 0; i < peopleInLine.length; i++) {

			sum += 25;
			change = (peopleInLine[i] - 25);
			sum -= change;

			if (sum < change) {
				a = "NO";
			} else
				a = "YES";
		}

		return a;
	}

	public void Prime() {
		int[] a = null;
		int n = 110, k = 0;
		for (int i = 101; i < n; i++) {
			boolean isPrime = true;
			for (int j = 3; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
				a[k] = i; 
				k = k + 1;

			}
		}
	}

	public static int res = 0;

	public static int find(int[] integers) {

		String art[] = new String[] { "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600" };

		System.out.println("first char" + art[0].charAt(0));

		int odd = 0, even = 0, pt = 0, ne = 0;
		int l = integers.length;

		for (int i : integers) {
			if (i % 2 == 0) {
				even = i;
				pt++;

			} else {
				odd = i;
				ne++;

			}
		}

		for (int i = 0; i < l; i++) {

			if (integers[i] > 0) {
				pt = i;
				System.out.println("length " + pt);
			} else {
				ne = i;
				System.out.println(res = integers[i]);

			}
			if (pt == (l - 1)) {

			}
		}

		if (even < odd) {

			res = integers[even];
		} else {

			res = integers[odd];
		}

		return res;

	}

	public static int sum2;

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
			return "";
		String output = "";

		for (String letter : lstOf1stLetter) {
			int counter = 0;
			for (String stock : lstOfArt) {
				if (stock.charAt(0) == letter.charAt(0)) {
					String[] parts = stock.split(" ");
					counter += Integer.parseInt(parts[1]);
				}
			}

			output += "(" + letter.charAt(0) + " : " + counter + ") - ";
		}
		output = output.replaceAll(" - $", "");
		return output;
		/*
		 * String no1 = "", aa = ""; char a; int sum1 = 0,temp=0;; int[] li = new
		 * int[lstOf1stLetter.length]; String[] s = new String[lstOf1stLetter.length];
		 * Map<String, Integer> ma = new HashMap<String, Integer>(); for (int k = 0; k <
		 * lstOfArt.length; k++) {
		 * 
		 * int sp=lstOfArt[k].lastIndexOf(" "); no1 = lstOfArt[k].substring(sp).trim();
		 * 
		 * sum1 = Integer.parseInt(no1); ma.put(lstOfArt[k].substring(0, 3), sum1);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < lstOf1stLetter.length; i++) { a =
		 * lstOf1stLetter[i].charAt(0);
		 * 
		 * li[i] = sum(a, ma); }
		 * 
		 * 
		 * for (int string : li) { temp+=string; }
		 * 
		 * if (temp > 0) { for (int k = 0; k < lstOf1stLetter.length; k++) {
		 * 
		 * s[k] = String.format("(%s : %d) - ", lstOf1stLetter[k].charAt(0), li[k]); }
		 * 
		 * for (int l = 0; l < lstOf1stLetter.length; l++) { aa = aa.concat(s[l]); }
		 * 
		 * // aa = aa.substring(0, aa.lastIndexOf("-")).trim();
		 * 
		 * aa=aa.replaceAll(" - $",""); } else { aa = ""; }
		 * 
		 * return aa.trim();
		 */
	}

	public static int sum(char ch, Map<String, Integer> ma) {
		sum2 = 0;
		for (String string : ma.keySet()) {

			if (ch == (string.charAt(0))) {

				sum2 += ma.get(string);
				// System.out.println("matched string values" + sum);
			}

		}

		return sum2;
	}

	public static String toCamelCase(String s) {
		String[] a = null;
		char ch, ch1;
		String res = "";
		if (s.contains("-")) {
			a = s.split("-");
		} else {
			a = s.split("_");
		}

		for (int i = 1; i < a.length; i++) {

			ch = a[i].charAt(0);
			// System.out.println(ch);
			ch1 = Character.toUpperCase(ch);
			// System.out.println(ch1);
			a[i] = a[i].replace(ch, ch1);
			// System.out.println(a[i]);

		}

		for (int r = 0; r < a.length; r++) {
			res = res.concat(a[r]);
		}

		return res;
	}

	public boolean check(String sentence) {
		// code
		boolean str = false;
		int counter = 0;
		LinkedHashSet<Character> hash_Set = new LinkedHashSet<Character>();

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) > 65 && sentence.charAt(i) < 123) {
				hash_Set.add(sentence.charAt(i));
			}
		}
		System.out.println("size of the set" + hash_Set.size());
		System.out.println(hash_Set);
		if (hash_Set.size() >= 27) {
			str = true;
		} else {
			str = false;
		}

		return str;
	}

	public static int rest;

	public static double duplicateCount(double arr[]) {
		// Write your code here

		// double[] a = new double[] { 1, 1, 1, 2, 1, 1 };

		rest = 0;
		double te = 0;
		// char[] ca = a.toCharArray();

		LinkedHashMap<Double, Integer> l = new LinkedHashMap<Double, Integer>();
		// Arrays.asList(arr);
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(arr[arr.length - 1]);
		for (double ch : arr) {
			// ch = Character.toLowerCase(ch);
			if (l.containsKey(ch)) {
				l.put(ch, l.get(ch) + 1);
			} else {
				l.put(ch, 1);
			}

		}

		
		for (double c : l.keySet()) {
			if (l.get(c) == 1) {
				te = c;

				// te = te + 1;

			}
		}

		return te;
	}

	public void star() {
		int no = 1;
		for (int i = 0; i < 10; i++) {
			no = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no++;
			}
			System.out.println("");
		}
	}

	public void triangle(int n) {
		int no = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no++;
			}
			System.out.println();
		}
	}

	public static char findMissingLetter(char[] array) {
		System.out.println("length " + array.length);
		char re = ' ';
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] - array[i - 1] != 1) {
				re = (char) (array[i] - 1);
				System.out.println(re);
			}
		}

		return re;
	}

	public static void reve(String st) {

		String[] str = st.split(" ");

		String reverSent = "";
		int[] a = { 25, 10, 8, 6, 2 };
		Arrays.parallelSort(a);
		for (int i : a) {
			System.out.println(i);
		}

		for (int i = 0; i < str.length; i++) {

			String word = str[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}
			reverSent += revWord + " ";
		}
		System.out.println("rever sent is " + reverSent);

	}

	public static void swap() {
		String str = "hello test again";
		String[] s = str.split(" ");
		List<String> l = new ArrayList<String>(Arrays.asList(s));
		l.toArray(s);
	
		for (String string : l.toArray(s)) {
			System.out.println(string);
		}

		Collections.swap(l, 0, 2);
		System.out.println("list" + l + l.get(2));
	}

	public static void reverNum() {
		int no = 123, rev = 0, rem;
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("reverse no" + rev);
	}

	public static void PrimeNo() {
		int l = 10;
		for (int i = 1; i <= 10; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isPrime = false;
				break;
			}
			if (isPrime) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// PrimeNo();
		reve("Java Concept Of The Day");

		String nv = "nived", nv2 = "nived";
		// String nv = new String("nived");
		// String nv2 = new String("nived");

		Stringpalin sf = new Stringpalin();
		File dest = new File("C:\\Personal\\payloads.list");

		String art[] = new String[] { "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600", "ABAR 200",
				"ABAR 200" };
		Collections.rotate(Arrays.asList(art), 3);
		System.out.println(Arrays.toString(art));

		/*
		 * Arrays.sort(art, Collections.reverseOrder()); //
		 * System.out.println(Arrays.toString(art));
		 * Collections.reverse(Arrays.asList(art));
		 * System.out.println(Arrays.asList(art));
		 * 
		 * // System.out.println(Arrays.toString(art));
		 * Collections.rotate(Arrays.asList(art), 2); List<String> n = new
		 * ArrayList<String>( Arrays.asList("ABAR 200", "CDXE 500", "BKWR 250",
		 * "BTSQ 890", "DRTY 600", "ABAR 200")); int a = Collections.binarySearch(n,
		 * "ABAR 200"); System.out.println("location " + a);
		 */
		List<String> n1 = new ArrayList<String>();
		
		/*
		 * for (String string : n) { if (!n1.contains(string)) { n1.add(string); } }
		 */

		/*
		 * File source = new
		 * File("\\\\164.55.120.91\\C$\\Portware\\distribution\\payloads.list"); long
		 * start = System.nanoTime(); Files.copy(source, dest);
		 */

		// duplicateCount(new double[] { 0, 0, 0.55, 0, 0 });
		String sd;
		BufferedReader br = new BufferedReader(new FileReader(dest));

		while ((sd = br.readLine()) != null) {
			if (sd.contains("payload-pwcommons")) {
				System.out.println(Integer.parseInt(sd.substring(22, 25)));
			}
		}

		/*
		 * 
		 * System.out.println("Time taken by Channel Copy = " + (System.nanoTime() -
		 * start));
		 */
		/*
		 * InputStream in = new FileInputStream(new File("C:\\Personal\\tinified.zip"));
		 * 
		 * File f = new File("\\\\164.55.120.91\\D$\\nived\\tinified.zip");
		 * f.createNewFile(); OutputStream out = new FileOutputStream(f); // Transfer
		 * bytes from in to out byte[] buf = new byte[1024]; int len;
		 * 
		 * while ((len = in.read(buf)) > 0) { out.write(buf, 0, len);
		 * 
		 * } in.close(); out.close();
		 */
		// System.out.println(sf.isTriangle(0, 2, 3));
		// sf.Prime();
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append("Test String"); File f =
		 * new File("C:\\Personal\\ebook.zip"); ZipOutputStream out = new
		 * ZipOutputStream(new FileOutputStream(f)); ZipEntry e = new ZipEntry("ebook");
		 * //out.putNextEntry(e); out.putNextEntry(e);
		 * 
		 * byte[] data = sb.toString().getBytes(); out.write(data, 0, data.length);
		 * out.closeEntry();
		 * 
		 * out.close();
		 */

		String cd[] = new String[] { "J", "B" };

		sf.star();
		String s11 = "is2 Thi1s T4est 3a";
		String[] ar = s11.split(" ");
		int l = s11.length();
		String res = " ";

		for (int i = 0; i < l; i++) {
			for (String string : ar) {
				if (string.contains(i + "")) {
					res += " " + string;
				}
			}
		}
		res.trim();

		// System.out.println(res.trim());

		/*
		 * HashMap<Character, String> map = new HashMap<>(); for (int i = 0; i < l; i++)
		 * { for (int j = 0; j < ar[i].length(); j++) { char ch = ar[i].charAt(j);
		 * 
		 * if (ch > 48 && ch < 57) {
		 * 
		 * map.put(ch, ar[i]); res += ar[i]; } } }
		 * 
		 * System.out.println(map.values());
		 * 
		 * for (String sd : map.values()) { System.out.print(res = sd);
		 * System.out.print(" "); }
		 * 
		 * System.out.println(res);
		 */
		/*
		 * int[] arr = { 10, 20, 30, 40, 50 }; List<Integer> a = new
		 * ArrayList<Integer>(); a.add(5); a.add(2); a.add(4); a.add(3); a.add(1);
		 * a.add(65);
		 * 
		 * List<Integer> b = new ArrayList<Integer>(); b.addAll(a);
		 * System.out.println(a);
		 * 
		 * int m = a.size() / 2; System.out.println(b);
		 * 
		 * Collections.reverse(Arrays.asList(arr)); System.out.println(b.equals(arr));
		 */

		/*
		 * String s1 = "Welcome to geeksforgeeks";
		 * 
		 * String[] ar = s1.split(" "); int l = ar.length; String res = " ";
		 * 
		 * for (int i = l-1; i >=0; i--) {
		 * 
		 * res += ar[i]+" "; } System.out.println(res.trim());
		 * 
		 */ // String tem = "";
		/* 
		 * int[] arr = { 10, 20, 30, 40, 50 }; int l = arr.length; int[] b = new int[l];
		 * int j = l; Collections.reverse(Arrays.asList(arr));
		 * System.out.println(Arrays.asList(arr)); for (int i = 0; i < l; i++) { b[l -
		 * 1] = arr[i]; l = l - 1; } for (int i = 0; i < arr.length; i++) {
		 * System.out.println(b[i]); } Arrays.equals(arr, b);
		 * 
		 * String a = "test"; String ab = "test";
		 * 
		 * if (a == ab) { System.out.println(true); } else { System.out.println(false);
		 * } System.out.println(a.equals(ab));
		 */
		/*
		 * int n = 10; for (int i = 1; i < n; i++) { boolean isPrime = true; for (int j
		 * = 2; j < i; j++) { if (i % j == 0) { isPrime = false; break; } } if (isPrime)
		 * System.out.println(i); }
		 * 
		 * 
		 * int n = 5; for (int i = n; i >= 1; --i) { for(int j=1;j<=i;++j) {
		 * System.out.print(j+" "); } System.out.println(); }
		 * 
		 * 
		 * Integer[] arr = { 10, 6, 20, 8 }; Arrays.sort(arr);
		 * 
		 * System.out.println(Arrays.toString(arr)); //
		 * System.out.println(Arrays.asList(arr));
		 * 
		 * List<Integer> a = new ArrayList<Integer>(); a.add(5); a.add(2);
		 * System.out.println("before " + a); Integer[] arr1 = new Integer[a.size()];
		 * 
		 * for (Object x : arr1) System.out.println(x);
		 */
		/*
		 * System.arraycopy(a.toArray(), 0, arr1, 0, a.size());
		 * System.out.println(Arrays.toString(arr1)); for (Integer x : arr1)
		 * System.out.println(x);
		 */

		/*
		 * int n = 7, flage = 0; int c = n / 2; if (n == 0 || n == 1) {
		 * System.out.println("not aprime"); } else { for (int i = 2; i <= c; i++) { if
		 * (n % i == 0) { System.out.println(n + " is not prime"); flage = 1; break; } }
		 * if (flage == 0) { System.out.println(n + " is prime"); } }
		 */

	}

}
