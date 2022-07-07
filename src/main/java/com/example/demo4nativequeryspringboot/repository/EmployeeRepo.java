package com.example.demo4nativequeryspringboot.repository;

import com.example.demo4nativequeryspringboot.entity.Employee;
import com.example.demo4nativequeryspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;

// is used when you want the certain method/class(=all methods inside) to be executed in a transaction
@Transactional
//
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

     //JPA
    // used to annotate repository interface methods.
    @Query("Select e from Employee e where e.emp_id=?1")
    Employee findByEmpIdd(Integer emp_id);

      //NATIVE QUERY
    @Query(value="Select * from Employee where emp_id=?1" , nativeQuery = true)
    Employee findByEmpId(Integer emp_id);

    //NATIVE QUERY WITH SELECT STATEMENT
    @Query(value="select sum(salary) from Employee where dept_name=?1" , nativeQuery = true)
    Integer SumOfSal(String dept_name);

    //update query
    // is used to enhance the @Query annotation so that we can execute
    // not only SELECT queries, but also INSERT, UPDATE, DELETE, and even DDL queries.
    @Modifying
    @Query(value="update Employee set price=?1 where emp_id=1", nativeQuery = true)
    void updatePrice(Float p);

    //delete query
    @Modifying
    @Query(value="delete from  Employee where emp_id=?1", nativeQuery = true)
    void deleteEmp(Integer id);


    //insert query
    @Modifying
    @Query(value="INSERT INTO Employee(`emp_id`, `age`, `dept_name`, `fname`, `lname`, `price`, `salary`) VALUES (?1,?2,?3,?4,?5,?6,?7)",nativeQuery = true)
    void insertEmpdetail(Integer emp_id, Integer age, String dept_name, String fname, String lname, Float price, Integer salary);


    //alter query
    @Modifying
    @Query(value="alter table Employee add column statement2 varchar(45) null", nativeQuery = true)
    void alteremp();





}
