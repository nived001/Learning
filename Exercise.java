package learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise {

	public static void main(String[] args) {
		Exercise train = new Exercise();
		String path = "C:\\Users\\nrampelly\\nived\\eclipse-workspace\\Sample\\src\\learning\\employees1.csv";
		List<String> data = null;
		try {
			data = Files.lines(Paths.get(path)).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		data.remove(0);
		List<Employee> empolyees = new ArrayList<>();
		data.forEach(entry -> { 
			Employee tmp = train.new Employee();
			tmp.setEmpno(entry.split(",")[0]);
			tmp.setEname(entry.split(",")[1]);
			tmp.setMgr(entry.split(",")[3]);

			empolyees.add(tmp);
		}); 

		for (Employee entry : empolyees) {
			if (!entry.isSet())
				entry.setSet(true);
			getHierechy(empolyees, entry);
		}
		System.out.println("Subordinates List: \n");
		for (Employee entry : empolyees) {
			System.out.println(entry.getEname() + " has " + getCount(entry) + " subordinates");
		}

		Employee king = getKing(empolyees); 
		System.out.println("\n");
		System.out.println("Leadership List: \n");
		leadershipSearch(king, 0);

	}

	private static void leadershipSearch(Employee employee, int level) {
		
		System.out.println(employee.getEname() + " has " + level + " managers in leadership chain");
		level++;
		for (Employee childs : employee.getSub()) {
			leadershipSearch(childs, level);
		}
	}

	private static Employee getKing(List<Employee> empolyees) {
		for (Employee iemp : empolyees) { 
			if (iemp.getMgr().isEmpty())
				return iemp;
		}
		return null;

	}

	private static int getCount(Employee emp) {

		int subnorinates = 0;
		for (Employee sub : emp.getSub()) {
			subnorinates += (getCount(sub) + 1);
		}
		return subnorinates;
	}

	private static void getHierechy(List<Employee> empolyees, Employee employee) {
		for (Employee iemp : empolyees) {
			if (employee.getEmpno().equals(iemp.getMgr())) {
				employee.setSet(true);
				employee.addSub(iemp);
				if (!iemp.isSet())
					getHierechy(empolyees, iemp);
			}
		}

	}

	public class Employee {
		private String empno;
		private String ename;
		private String mgr;
		private boolean set;

		private Set<Employee> sub;

		public Employee() {
			setSet(false);
			sub = new LinkedHashSet<>();
		}

		public String getEmpno() {
			return empno;
		}

		public void setEmpno(String qmpno) {
			this.empno = qmpno;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getMgr() {
			return mgr;
		}

		public void setMgr(String mgr) {
			this.mgr = mgr;
		}

		public boolean isSet() {
			return set;
		}

		public void setSet(boolean set) {
			this.set = set;
		}

		public Set<Employee> getSub() {
			return sub;
		}

		public void setSub(Set<Employee> sub) {
			this.sub = sub;
		}

		public void addSub(Employee emp) {
			sub.add(emp);
		}
	}
}
