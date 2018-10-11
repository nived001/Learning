package learning;

import java.io.Serializable;

public class Employee implements Serializable {
	public String name;
	public String address;
	public int SSN;
	public int number;

	public Employee(String name, String address, int SSN, int number) {
		this.name = name;
		this.SSN = SSN;
		this.number = number;
		this.address = address;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
