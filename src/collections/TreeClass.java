package collections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.validator.ValidateWith;

public class TreeClass {

	public static int camelcase(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
		return count + 1;
	}

	/**
	 * Validate password with regular expression
	 * 
	 * @param password password for validation
	 * @return true valid password, false invalid password
	 */
	public static boolean validate(String password) {
		Pattern pattern;
		Matcher matcher;

		String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
		return matcher.matches();

	}

	public static void pasword(String password) {

		// String delimiter = "[a-zA-Z0-9]";
		Pattern special = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = special.matcher(password);
		boolean spec = m.find();
		Pattern lo = Pattern.compile("[a-z]");
		Matcher low = lo.matcher(password);
		boolean lower = low.find();
		Pattern up = Pattern.compile("[A-Z]");
		Matcher upp = lo.matcher(password);
		boolean uppper = upp.find();

		Pattern number = Pattern.compile("[0-9]");
		Matcher num = number.matcher(password);
		boolean no = num.find();

	}

	public static void hashset() {
		
		int[] aa=new int[] {5,56};
		List<String> li=new ArrayList<>();
		
		li.toArray(aa);
		Collections.sort(Arrays.);
		TreeSet<String> s = new TreeSet<String>();
		s.add("test");
		// s.add(null);
		s.add("est");
		s.stream().sorted().forEach(System.out::println);
		// s.add(null);

		s.forEach(e -> System.out.println("not sort" + e));

		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> b = new HashSet<Integer>(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		System.out.println(b);

		System.out.println("after sort" + b);
		b.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		Set c = b.stream().filter(e -> e % 2 == 0).collect(Collectors.toSet());
		System.out.println(c);
	}

	public static void main(String[] args) {
		validate("afavT8$");
	}
}
