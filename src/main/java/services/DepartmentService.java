package services;

import entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartmentService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("compeny");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    public void create(Department department){
        tx.begin();
        em.persist(department);
        tx.commit();
    }

    public void update(Department department){
        tx.begin();
        em.remove(em.find(Department.class, department.getDeptId()));
        em.persist(department);
        tx.commit();
    }

    public Department findById(Integer id){
        Department department = em.find(Department.class, id);
        em.detach(department);
        return department;
    }

    public void delete(Department department){
        tx.begin();
        em.remove(department);
        tx.commit();
    }
}
