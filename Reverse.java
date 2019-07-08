package learning;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 3, 46, 6, 5,9 ,67};
		int i = 0, j = 0, temp = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		int k = (a.length) / 2;
		int m = 46;
		System.out.println(" "+a[k]);
		System.out.println(" ");

		if (a[k] == m) {

			System.out.println(a[k] + "is found at............ " + (k));

		} else if (m > a[k]) {
			for (i =0; i < a.length; i++) {
				if (a[i] == m) {
					System.out.println(a[i] + "is found at " + i);
				}
			}

		} else {

			System.out.println("not found");
		}
	}

}
