import entities.Department;
import entities.Employee;
import services.DepartmentService;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();
        Department vetDept = new Department(5, "Veterinary Dept.");
        Department adminOffice = new Department(4, "Administration");


        Employee employee2 = new Employee("Sean", "Rowan", vetDept, "484-574-3999");
        Employee employee = new Employee("Vicki", "Rey", vetDept, "571-331-5431");
        Employee admin1 = new Employee("Melanie", "Augustine", adminOffice, "555-555-1234");
        Employee admin2 = new Employee("Jutta", "Pils", adminOffice, "123-321-2132");

        List<Employee> vetList = new ArrayList<Employee>();
        List<Employee> adminList = new ArrayList<Employee>();


        vetList.add(employee);
        vetList.add(employee2);
        adminList.add(admin1);
        adminList.add(admin2);
        adminOffice.setEmployeeList(adminList);
        vetDept.setEmployeeList(vetList);
        departmentService.create(vetDept);
        departmentService.create(adminOffice);












    }
}
