package learning;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		// Scanner sc=new
		int dec[] = new int[7];
		for (int i = 1; i <= 1000; i++) {
			++dec[1 + ran.nextInt(6)];

		}
		for (int j = 1; j < dec.length; j++) {
			System.out.println(dec[j]);

		}
	}

}
