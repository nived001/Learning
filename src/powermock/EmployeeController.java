package com.gitshah.powermock;

public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * This method is responsible to return the projected count of employees in the
	 * system. Let's say the company is growing by 20% every year, then the project
	 * count of employees is 20% more than the actual count of employees in the
	 * system. We will also round it off to the ceiling value.
	 * 
	 * @return Total number of projected employees in the system.
	 */
	public int getProjectedEmployeeCount() {
		final int actualEmployeeCount = employeeService.getEmployeeCount();
		return (int) Math.ceil(actualEmployeeCount * 1.2);
	}

}
