package com.societegenerale.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.societegeneral.enums.Gender;
import com.societegeneral.model.Employee;
import com.societegeneral.repository.EmployeeRepository;
import com.societegeneral.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {
	
	@InjectMocks
	EmployeeServiceImpl service = new EmployeeServiceImpl();

	@Mock
	EmployeeRepository employeeRepo;

	Employee employee = new Employee();
	List<Employee> listEmp = new ArrayList<>();
	@Before
	public void setUp() throws ParseException {
		MockitoAnnotations.initMocks(this);
		employee.setFirstName("tanmoy");
		employee.setLastName("dasgupta");	
		employee.setGender(Gender.MALE);
		employee.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("12-02-2012"));
		employee.setDepartment("CSE");
		listEmp.add(employee);
	}
	
	@Test
	public void createEmployeeTest() {
		Mockito.when(employeeRepo.save(employee)).thenReturn(employee);
		assertNotNull(employee);
		assertNotNull(service.createEmployee(employee));
		assertEquals("tanmoy", service.createEmployee(employee).getFirstName());
	}

	@Test
	public void getAllEmployeeDetailsTest() {
		Mockito.when(employeeRepo.findAll()).thenReturn(listEmp);
		assertNotNull(listEmp);
		assertEquals(listEmp,service.getAllEmployeeDetails());
	}
}
