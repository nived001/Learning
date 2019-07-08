package com.gitshah.powermock;

import org.junit.Assert;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;

@PrepareForTest(Employee.class)
@RunWith(PowerMockRunner.class)
public class EmployeeControllerTest {

	@org.junit.Test
	public void shouldReturnCountOfEmployeesFromTheService() {
		EmployeeService mock = PowerMockito.mock(EmployeeService.class);
		// Next statement essentially says that when
		// getProjectedEmployeeCount method
		// is called on the mocked EmployeeService instance,
		// return 8.

		PowerMockito.when(mock.getEmployeeCount()).thenReturn(2);
		EmployeeController employeeController = new EmployeeController(mock);
		Assert.assertEquals(3, employeeController.getProjectedEmployeeCount());

	}

}
