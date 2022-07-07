package com.example.demo4nativequeryspringboot;
import com.example.demo4nativequeryspringboot.entity.Employee;
import com.example.demo4nativequeryspringboot.servic.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

/**
 * @author Soumya
 */

@SpringBootApplication
public class Demo4nativequeryspringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo4nativequeryspringbootApplication.class, args); }

	@Override
	public void run(String... args) throws Exception {
//		getEmpdetails();
//sumSalary();
//	update();
//	delete();
//		insert();
		alter();

	}

	@Autowired
	private EmployeeService service;



	public Employee getEmpdetails(){
		System.out.println("Enter id of the employee");
		Scanner scan=new Scanner(System.in);
		Integer id1=scan.nextInt();
		Employee e1= service.getEmpbyId(id1);
		System.out.println(e1);
		return  e1;
	}


	public  Integer sumSalary(){
		System.out.println("Enter department name");
		Scanner scan=new Scanner(System.in);
		String dp=scan.nextLine();
		Integer dname=service.sumofsal(dp);
		System.out.println(dname);
		return  dname;
	}

	public  void update(){
		System.out.println("Enter price value to update");
		Scanner scan=new Scanner(System.in);
		Float pp=scan.nextFloat();
		service.updateempprice(pp);
		System.out.println("Updated successfully");
	}

	public  void delete(){
		System.out.println("Enter id value to delete");
		Scanner scan=new Scanner(System.in);
		Integer id1=scan.nextInt();
		service.deleteEmp(id1);
		System.out.println("deleted successfully");
	}

	public void insert(){
		System.out.println("Entered employee details are inserted into the table");
		service.insertEmpdetail(9,25,"DI","Kiran","kumar",0.11f,90000);
	}

	public void alter(){
		System.out.println("Employee Table has been altered");
		service.alterEmp();

	}
}



