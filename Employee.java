package learning;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee {
	private String empno;
	private String ename;
	private String mgr;
	private boolean set;

	private Set<Employee> sub;

	public Employee(String empno,String ename,String mgr) {
		//setSet(false);
		///sub = new LinkedHashSet<>();
		this.empno = empno;
		this.ename = ename;
		this.mgr = mgr;
	}
	

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
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