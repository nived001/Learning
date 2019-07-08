package learning;

public class A2 extends ClassLoader {

	public int display(int k) {
		String c = this.getClass().getName();
		ClassLoader classLoader = this.getClass().getClassLoader();

		// Load the target class using its binary name
		Class loadedMyClass;
		try {
			loadedMyClass = classLoader.loadClass("learning.A3");
			System.out.println("name of the class is" + loadedMyClass.getName());
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} finally {

		}
		return k;

	}

	public static void swap() {
		String a = "AQyt";
		String b = "Testing";
		int l = a.length();
		a = a.concat(b);
		b = a.substring(0, l);
		a = a.substring(l, a.length());
		System.out.println("a is " + a + " b is " + b + "" + 5 / 2);

	}

	public static void primeNos() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			boolean f = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					f = false;
					break;
				}

			}
			if (f) {
				System.out.println(i);
			}

		}
	}

	public static void primt(int n) {
		int l = n / 2;
		boolean f = false;
		if (n == 0 || n == 1) {
			System.out.println("not a prime no");
		} else {
			for (int i = 2; i <= l; i++) {
				if (n % i == 0) {

					System.out.println("not prime");
					f = true;
					break;
				}

			}
			if (f == false) {
				System.out.println("prime no" + n);
			}
		}
	}

	public float display(int k, int h) {

		System.out.println("A3 class method");
		return h;
	}

	public static void main(String[] args) throws Exception {

		primeNos();
		swap();
		// TODO Auto-generated method stub
		/*
		 * System.out.println("From class A2");
		 * 
		 * File f = new File("C:\\nived.txt"); BufferedReader br = new
		 * BufferedReader(new FileReader(f));
		 * 
		 * Scanner s = new Scanner(f);
		 * 
		 * String st;
		 * 
		 * s.useDelimiter("\\Z"); System.out.println(s.next());
		 * 
		 * while((st=br.readLine())!=null) { System.out.println(st); }
		 * 
		 * 
		 * while(s.hasNextLine()) {
		 * 
		 * }
		 */

		/*
		 * int n = 6; for (int i = 1; i < n; i++) {
		 * 
		 * for (int j = n; j >= i; j--) { System.out.print(" "); }
		 * 
		 * for (int j = 1; j <= i; j++) { System.out.print("* "); }
		 * System.out.println(); }
		 * 
		 * System.out.println(Files.getFileExtension("C:\\nived.txt"));
		 * 
		 * HashMap h = new HashMap<>(); h.put(1, "test"); h.put(null, "test");
		 * 
		 * System.out.println("hash map" + h);
		 * 
		 * String str = "testinging"; char[] ch = str.toCharArray(); // int c=0;
		 * LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character,
		 * Integer>(); for (char d : ch) {
		 * 
		 * if (l.containsKey(d)) { l.put(d, l.get(d) + 1); System.out.println(l.get(d));
		 * } else { l.put(d, 1); } } System.out.println(l.entrySet());
		 */

	}

}
