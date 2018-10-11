package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collections {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10)
			.until(ExpectedConditions.elementToBeClickable(By.id("test")));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arl = new LinkedList<String>();
		arl.add("test");

		arl.add(0, "zero");
		arl.add(1, "first");
		arl.add(2, "second");

		/*
		 * for (String string : arl) { System.out.println(string); }
		 */
		ListIterator<String> it = arl.listIterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		/*
		 * Iterator<String> it = arl.iterator(); while (it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 */
		// arl.add(2, "one");

		// System.out.println("Size" + arl.get(2));

		/*
		 * arl.add(1, "One"); for (String string : arl) {
		 * 
		 * if (string.equals("2")) { System.out.println("for each found"); }
		 * else { System.out.println("for each not"); }
		 * 
		 * } Iterator<String> it = arl.iterator(); while (it.hasNext()) { if
		 * (it.next().equals("2")) { System.out.println("found"); } else {
		 * System.out.println("not"); } System.out.println(it.next()); }
		 * System.out.println("before" + arl.size()); arl.remove(1);
		 * System.out.println("after" + arl);
		 * 
		 * ArrayList<Integer> in = new ArrayList<>(); in.add(1); in.add(2);
		 * LinkedList<String> ll = new LinkedList<>(); ll.add("test");
		 * ll.add("Testing"); ll.remove(); System.out.println(ll);
		 */

	}

}
