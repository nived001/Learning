package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		list1.addAll(list);
		
		//System.out.println(list);
		System.out.println(list1);
		
	/*	ListIterator<Integer> l = list.listIterator(list.size());

		while (l.hasPrevious()) {
			System.out.println(list);
		}
*//*
		for (int i = 1; i < 10; i += 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/

	}
}
