package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps extends CheckDate {

	public String ram(String c) {
		System.out.println(c);
		return c;
	}

	public String test(String k) {
		System.out.println("static method");
		// return k;
		return k;

	}

	public static void main(String[] args) {
		CheckDate.testing(10);

		Maps ma = new Maps();
		ma.ram(10);

		//test(10, 1);
		// TODO Auto-generated method stub
		// Maps ab = new Maps();
		/*
		 * Map<Integer, String> m = new HashMap<Integer, String>();
		 * 
		 * m.put(1, "test"); m.put(2, "atest"); for (Entry<Integer, String> m1 :
		 * m.entrySet()) { if (m.containsKey(1)) { System.out.println("found");
		 * } else { System.out.println("not"); }
		 * 
		 * System.out.println(m1.getKey() + " " + m1.getValue());
		 * 
		 * } System.out.print(String.format("%010d", 0).replace("0",
		 * "Shreyash\n"));
		 */
	}

}
