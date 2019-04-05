package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee;

    @Before
    public void setup(){
        employee = new Employee();
    }
    @Test
    public void setId() {
        //Given
        Integer expected = 22;
        //When
        employee.setId(expected);
        //Then
        Assert.assertEquals(expected, employee.getId());
    }

    @Test
    public void setFirstName() {
        //Given
        String expected = "Sean";
        //When
        employee.setFirstName(expected);
        //Then
        Assert.assertEquals(expected, employee.getFirstName());
    }

    @Test
    public void setLastName() {
        //Given
        String expected = "Rowan";
        //When
        employee.setLastName(expected);
        //Then
        Assert.assertEquals(expected, employee.getLastName());
    }
//
//    @Test
//    public void setDepartment() {
//        //Given
//        Department expected = new Department();
//        //When
//        employee.setDepartment(expected);
//        //Then
//        Assert.assertEquals(expected, employee.getDepartment());
//
//    }

    @Test
    public void setPhoneNumber() {
        //Given
        String expected = "484-574-3999";
        //When
        employee.setPhoneNumber(expected);
        //Then
        Assert.assertEquals(expected, employee.getPhoneNumber());
    }
}