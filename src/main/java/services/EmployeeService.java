package services;

import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class EmployeeService {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("company");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction tx = em.getTransaction();



    public void create(Employee employee){
        tx.begin();
        em.persist(employee);
        tx.commit();
    }

    public void update(Employee employee){
        tx.begin();
        em.remove(em.find(Employee.class, employee.getId()));
        em.persist(employee);
        tx.commit();
    }

    public Employee findById(Integer id){
        Employee employee = em.find(Employee.class, id);
        em.detach(employee);
        return employee;
    }

    public List<Employee> findAll(){
        tx.begin();
        List employeeList = em.createQuery("SELECT e FROM Employee e ").getResultList();
        return employeeList;
    }

    public void delete(Employee employee){
        tx.begin();
        em.remove(employee);
        tx.commit();
    }


}
