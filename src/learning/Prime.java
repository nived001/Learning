package learning;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		for (int i = 1; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

}
