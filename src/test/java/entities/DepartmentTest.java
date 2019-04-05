package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentTest {
    Department department;
    @Before
    public void setup(){
        department = new Department();
    }
    @Test
    public void setDeptId() {
        //Given
        Integer expected = 1;
        //When
        department.setDeptId(expected);
        //Then
        Assert.assertEquals(expected, department.getDeptId());
    }

    @Test
    public void setName() {
        //Given
        String expected = "Small Business Tech";
        //When
        department.setName(expected);
        //Then
        Assert.assertEquals(expected, department.getName());
    }

    @Test
    public void setEmployeeList() {
        //Given
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        //When
        department.setEmployeeList(employees);
        //Then
        Assert.assertEquals(employees, department.getEmployeeList());
    }
}