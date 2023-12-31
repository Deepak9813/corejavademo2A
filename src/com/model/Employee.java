package com.model;

public class Employee {

	 private int id;
	    private String firstName;
	    private String lastName;
	    private String department;
	    private double salary;
	    
	    
	    //default constructor
	    public Employee() {
			// TODO Auto-generated constructor stub
		}

	    //parameterized constructor
		public Employee(int id, String firstName, String lastName, String department, double salary) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.department = department;
			this.salary = salary;
		}

		//getters and setters method
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		
		//toString() method
		@Override
		public String toString() {
			return "\n Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
					+ department + ", salary=" + salary + "]";
		}
		

}
