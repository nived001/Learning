package learning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import org.junit.Assert;

@RunWith(PowerMockRunner.class)
public class CountCharsTest {
	CountChars c = new CountChars();

	@Test
	public void testAvailable() {

		Assert.assertEquals(2, c.getCount("test", 't'));
	}

	@Test
	public void testUnAvailable() {

		Assert.assertEquals(0, c.getCount("test", 'a'));
	}

	@Test
	public void testException() {
		int ab = 2;
		
		
		Character a = (char) ab;
		System.out.println(a);

		Assert.assertEquals(0, c.getCount("test", a));
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * 
	 * }
	 */

}
