package learning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo implements Serializable {
	public String name;
	public String address;
	public int SSN;
	public int number;

	public SerializeDemo(String name, String address, int SSN, int number) {
		this.name = name;
		this.SSN = SSN;
		this.number = number;
		this.address = address;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeDemo e = new SerializeDemo("Reyan Ali", "Phokka Kuan, Ambehta Peer", 11122333, 101);

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\tools\\emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
