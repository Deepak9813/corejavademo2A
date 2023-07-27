package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {

		add();
		getAll();
		delete();

	}

	// add student
	static void add() {

		StudentService sts = new StudentServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		do {
			Student s = new Student();

			System.out.println("Enter the Student Id");
			s.setId(sc.nextInt());

			System.out.println("Enter the Student Name");
			s.setName(sc.next());

			System.out.println("Enter the  Student Age");
			s.setAge(sc.nextInt());

			System.out.println("Enter the Student Address");
			s.setAddress(sc.next());

			System.out.println("Enter the Student Phone Number");
			s.setPhoneNo(sc.next());

			sts.addStudent(s);

			System.out.println("Do you want to add more[y/n]?");
			flag = sc.next().charAt(0);

		} while (flag == 'y');

	}

	// get all student[fetchAll]
	static void getAll() {

		StudentService sts = new StudentServiceImpl();

		List<Student> slist = sts.getAllStudent();
		System.out.println(slist);

	}

	//delete student
	static void delete() {
		StudentService sts = new StudentServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		char flag = 'y';
		
		System.out.println("Do you want to delete Student[y/n]?");
		flag = sc.next().charAt(0);
		
		if(flag=='y') {
			
			System.out.println("Which Student[index] do you want to remove/delter?");
			
			//sts.deleteStudent(sc.nextInt());  //in one line
			
			int index = sc.nextInt();	//in two lines
			sts.deleteStudent(index);
			
			//get student after delete
			getAll();
		}
	}
}
