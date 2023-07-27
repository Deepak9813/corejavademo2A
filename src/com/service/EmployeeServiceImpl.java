package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	static List<Employee> elist = new ArrayList<>();

	@Override
	public void addEmployee(Employee e) {
//		elist.add(e);
//		System.out.println("========Successfully Added======= Size = "+elist.size());

		// From Database
		try {

			// register driver [load the driver class]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql, create statement, execute sql
			String sql = "insert into employee(firstName, lastName, department, salary) values ('" + e.getFirstName()
					+ "', '" + e.getLastName() + "', '" + e.getDepartment() + "', '" + e.getSalary() + "')";

			Statement stm = con.createStatement();
			stm.execute(sql);

			con.close();

			System.out.println("Added Successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		// elist.remove(id);

		// From Database
		try {

			// register driver [load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql, create statement, execute query
			String sql = "delete from employee where id = '" + id + "'";

			Statement stm = con.createStatement();
			stm.execute(sql);

			con.close();

			System.out.println("Deleted Successfully...");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<Employee> getAllEmployee() {

		// From Database
		try {

			// register driver [load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql, create statement, execute sql
			String sql = "select * from employee";

			Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id = "+rs.getInt("id"));
				System.out.println("FirstName = "+rs.getString("firstName"));
				System.out.println("LastName = "+rs.getString("lastName"));
				System.out.println("Department = "+rs.getString("department"));
				System.out.println("Salary = "+rs.getDouble("salary"));
				
				System.out.println("==============================");
				
				
			}

			con.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return elist;
	}

}
