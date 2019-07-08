package collections;

import java.util.*;

public class MapClass {

	public static void hashMap() {
		HashMap<Integer, String> ma = new HashMap<Integer, String>();
		ma.put(2, "two");
		ma.put(1, "one");
		ma.put(2, "two");
		ma.put(3, "three");

		ma.put(null, "");
		ma.put(null, "");

		ma.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		// System.out.println(ma);
		/*
		 * ma.entrySet().forEach(entry -> { System.out.println(entry.getKey() + ": " +
		 * entry.getValue()); if (entry.getValue().equals("one")) {
		 * System.out.println("true"); } });
		 * 
		 * ma.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		 */
	}

	public static void treemap() {
		TreeMap<Integer, String> a = new TreeMap<>();
		a.put(3, "three");
		a.put(2, "two");
		a.put(1, "one");
		a.put(2, "two"); 
		// a.put(null, "test");   
		System.out.println(a);

	}         

	public static void main(String[] args) {
		treemap();
		hashMap();
	}

}
