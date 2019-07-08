package com.gitshah.powermock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
public class EmployeeServiceTest {
	@Test
	public void shouldReturnTheCountOfEmployeesUsingTheDomainClass() {
		PowerMockito.mockStatic(Employee.class);
		PowerMockito.when(Employee.count()).thenReturn(00);
		EmployeeService employeeService = new EmployeeService();
		Assert.assertEquals(900, employeeService.getEmployeeCount());
	}
}
