package learning;

import java.io.*;

public class Deserialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("C:\\tools\\emp.txt"));
		SerializeDemo e = (SerializeDemo) obj.readObject();
		System.out.println(e.name + " " + e.address);
		obj.close();
	}

}
