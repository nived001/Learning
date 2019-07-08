package learning;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeClass {
	private int hour = 1, min = 2, second = 3;

	public void setTime(int hour, int min, int second) {
		/*
		 * hour = ((h >= 0 && h < 24) ? h : 0); min = ((m >= 0 && m < 60) ? m : 0);
		 * second = ((s >= 0 && s < 60) ? s : 0);
		 */
		this.hour = 11;
		this.min = 22;
		this.second = 33;
		System.out.println(hour + "" + min + "" + second);

	}

	public static void main(String[] args) {
		TimeClass t = new TimeClass();
		//t.setTime(10, 70, 30);

		SimpleDateFormat FIX_FORMATTER = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(FIX_FORMATTER.format(cal.getTime()));

	}
	/*
	 * public String toMilitary() { return String.format("%d:%02d:%02d", hour, min,
	 * second); }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * TimeClass t = new TimeClass(); t.setTime(10, 70, 30);
	 * System.out.println(t.toMilitary());
	 * 
	 * 
	 * }
	 */

}
