package collections;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ListClass {
	static CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<Integer>();

	public static void rou() {
		BigDecimal a = new BigDecimal("1.74443445");
		BigDecimal roundOff = a.setScale(4, BigDecimal.ROUND_CEILING);
		System.out.println(roundOff);
	}

	public static void arrayListExamples() {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(e -> {
			if (e.equals(2)) {
				System.out.println("its available");
			}
		});

		list.forEach(System.out::println);
		list.add(0, 0);
		System.out.println("after" + list);
		list.removeIf(e -> e.equals(2));

		System.out.println("after set" + list);
		// list.removeAll(list);
		// System.out.println("after remove" + list);
		// list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		List<Integer> n = new ArrayList<Integer>();

		n = list.stream().filter(e -> e.equals(6)).collect(Collectors.toList());

		System.out.println(n);

	}

	public static void linkedListExamples() {
		LinkedList<Integer> lin = new LinkedList<Integer>();

		lin.add(1);
		lin.add(2);
		lin.add(3);
		lin.addFirst(0);
		lin.forEach(System.out::print);
		// System.out.println(lin);
		// lin.subList(1, 3).clear();
		// System.out.println(lin.subList(0, 2));
	}

	public static void main(String[] args) {
		rou();
	}

}
