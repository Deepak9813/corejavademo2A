package com.model;

public class Teacher {

	private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String teacherId;
    private String department;  //eg: Physics, Mathematics, English,History, etc
    private String specialization; //eg: Quantum Mechanics, Calculus, American Literature, European History, etc  

    //default constructor
    public Teacher() {
		
	}
    
    //parameterized constructor
	public Teacher(String firstName, String lastName, int age, String gender, String teacherId, String department,
			String specialization) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.teacherId = teacherId;
		this.department = department;
		this.specialization = specialization;
	}
	
	
	//getters and setters methods
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	//toString() method
	@Override
	public String toString() {
		return "\n Teacher [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", teacherId=" + teacherId + ", department=" + department + ", specialization=" + specialization
				+ "]";
	}
    
	
}
