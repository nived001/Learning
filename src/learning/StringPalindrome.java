package learning;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String scr = "madam", rev="";
		int l = scr.length();
		for (int i = l - 1; i >= 0; --i) {
			rev = rev + scr.charAt(i);
		}
		System.out.println(rev);
	}

}
