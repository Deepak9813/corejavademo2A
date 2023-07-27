package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {

		//add();
		getAll();
		//delete();

	}

	// add Employee
	static void add() {

		EmployeeService es = new EmployeeServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		do {

			Employee e = new Employee();

			System.out.println("Enter Student Id");
			e.setId(sc.nextInt());

			System.out.println("Enter first Name");
			e.setFirstName(sc.next());

			System.out.println("Enter last Name");
			e.setLastName(sc.next());

			System.out.println("Enter department");
			e.setDepartment(sc.next());

			System.out.println("Enter salary");
			e.setSalary(sc.nextDouble());

			es.addEmployee(e);

			System.out.println("Do you want to add more[y/n]?");
			flag = sc.next().charAt(0);

		} while (flag == 'y');

	}

	// get all Employee [fetchAll Employee]
	static void getAll() {

		EmployeeService es = new EmployeeServiceImpl();

		List<Employee> elist = es.getAllEmployee();

		System.out.println(elist);
	}

	// delete Employee
	static void delete() {
		EmployeeService es = new EmployeeServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';
		
		System.out.println("Do you want to delete Employee[y/n]");
		flag = sc.next().charAt(0);

		if (flag == 'y') {

			System.out.println("Which Employee[id] you want to remove/delete?");
			
			//es.deleteEmployee(sc.nextInt()); //in one line
			
			int id = sc.nextInt();	//in two lines
			es.deleteEmployee(id);

			// get product after delete
			getAll();

		}
	}
}
