package services;

import entities.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {
    EmployeeService employeeService;

    @Before
    public void setup(){
        employeeService = new EmployeeService();

    }
    @Test
    public void create() {
        Employee employee = new Employee();
        employee.setFirstName("Sean");
        employee.setLastName("Rowan");
        employee.setDepartmentId(1);

        employeeService.create(employee);
    }

    @Test
    public void update() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void delete() {
    }
}