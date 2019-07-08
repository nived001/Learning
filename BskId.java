package learning;

public class BskId {

	public static void main(String args[]) {
		int n=10;
		/*String str = "test",rev="";
		int l = str.length();
		for (int i = l-1; i>=0; i--)
		{
			rev += str.charAt(i);
			
		}
		System.out.println(rev);
		
		for(int i=1;i<n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					isPrime=false;
				break;
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		int n=123,rem=0,rev=0;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		
		
		int f=5;
		int a=1;
	
	for(int i=1;i<=f;i++) {
		a=a*i;
	}
		System.out.println(a);
		
		*//*int num=6,a=1;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				a++;
			}
			System.out.println();
		}
		int rows = 5, k = 0;*/
		for(int i=1;i<n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					isPrime=false;
				break;
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

        /*for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }*/
		
	}
}
