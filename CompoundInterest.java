package learning;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// A =P(1+R/n)^nt

		double amount=0, principal = 50000, rate = 0.1;
		double n=1;
		for (int days = 1; days <=5; days++) {
			amount = principal * Math.pow(1 + (rate/n), days*n);
			System.out.println(amount);
		}

		
	}

}
