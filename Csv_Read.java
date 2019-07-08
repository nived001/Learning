package learning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv_Read {

	static int counter = 0;
	static int counter2 = 0;
	static List<Employee> records = new ArrayList<>();
	static List<Employee> t = null;
	static Employee et;

	public List<Employee> readFile() throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\nrampelly\\nived\\eclipse-workspace\\Sample\\src\\learning\\employees1.csv"))) {
			String line = "";
			br.readLine();

			try {
				while ((line = br.readLine()) != null) {

					String[] values = line.split(",");
					if (values.length > 0) {
						et = new Employee(values[0], values[1], values[3]);
						records.add(et);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return records;

	} 

	public static void getHierechy(String empno) {

		for (Employee e : records) {
			if (empno.equals(e.getMgr())) {

				counter++;
				getHierechy(e.getEmpno());
			}

		}

	}

	public static void getLeadershipCount(String empno) {
		
		for (Employee e : records) {
			if (empno.equals(e.getEmpno())&&(!e.getMgr().isEmpty())) {

				counter2++;
				getLeadershipCount(e.getMgr());
				break;

			} 
		}
	}

	public static void printNumberOfSubOrdinates(String empno) {
		getHierechy(empno);
		System.out.println("Employee : " + empno + " has " + counter + " subordinates");

	}

	public static void printLeadership(String empno) {
		getLeadershipCount(empno);
		System.out.println("Employee : " + empno + " has " + counter2 + " manager in leadership chain");

	}

	public static void main(String args[]) throws FileNotFoundException, IOException {

		Csv_Read c = new Csv_Read();
		t = c.readFile();

		 printNumberOfSubOrdinates("7566");
		printLeadership("7839");

	}

}
