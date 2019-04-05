package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    private Integer deptId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(Integer deptId, String name) {
        this.deptId = deptId;
        this.name = name;

    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
