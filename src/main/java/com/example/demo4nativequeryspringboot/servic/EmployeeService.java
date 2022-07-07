package com.example.demo4nativequeryspringboot.servic;

import com.example.demo4nativequeryspringboot.entity.Employee;
import com.example.demo4nativequeryspringboot.repository.EmployeeRepo;
import com.example.demo4nativequeryspringboot.entity.Employee;
import com.example.demo4nativequeryspringboot.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employee getEmpbyId(Integer emp_id){
        return repo.findByEmpIdd(emp_id);
    }

    public Integer sumofsal(String dept_name){
        return repo.SumOfSal(dept_name);
    }

    public void updateempprice(Float p){
         repo.updatePrice(p);
    }

    public void deleteEmp(Integer id){
        repo.deleteEmp(id);
    }

    public void insertEmpdetail(Integer emp_id, Integer age, String dept_name, String fname, String lname, Float price, Integer salary){
        repo.insertEmpdetail(emp_id, age, dept_name, fname, lname, price, salary);
    }

    public void  alterEmp(){
        repo.alteremp();
    }
}
