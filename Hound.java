package learning;

public class Hound   {
	
		public void bark() {
			System.out.println("Dog bark");
		}
	

	public static void main(String[] args) {
		Hound h = new Hound();
		//Do g;
		Hound.Teste a = new Hound().new Teste();
		a.bark();
		
	}
	

	 class Teste   {
		public void sniff() {
			System.out.println("hound sniffing");
		}

		public void bark() {
			System.out.println("houd barking");
		}
	}
}

