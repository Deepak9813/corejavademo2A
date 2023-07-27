package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Teacher;
import com.service.TeacherService;
import com.service.TeacherServiceImpl;

public class TestTeacher {

	public static void main(String[] args) {
		add();
		getAll();
		delete();
	}

	static void add() {

		TeacherService ts = new TeacherServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		do {

			Teacher t = new Teacher();

			System.out.println("Enter First Name");
			t.setFirstName(sc.next());

			System.out.println("Enter Second Name");
			t.setLastName(sc.next());

			System.out.println("Enter Age");
			t.setAge(sc.nextInt());

			System.out.println("Enter Gender");
			t.setGender(sc.next());

			System.out.println("Enter Id");
			t.setTeacherId(sc.next());

			System.out.println("Enter Department");
			t.setDepartment(sc.next());

			System.out.println("Enter Specialization");
			t.setSpecialization(sc.next());

			ts.addTeacher(t);

			System.out.println("Do you want to add more [y/n]?");
			flag = sc.next().charAt(0);

		} while (flag == 'y');
	}

	// get all teacher[fetchAll]
	static void getAll() {

		TeacherService ts = new TeacherServiceImpl();

		List<Teacher> tlist = ts.getAllTeacher();
		
		System.out.println(tlist);
	}
	
	//delete teacher
	static void delete() {
		
		TeacherService ts = new TeacherServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		char flag = 'y';
		
		System.out.println("Do you want to delete teacher [y/n]?");
		flag = sc.next().charAt(0);
		
		if(flag == 'y') {
			System.out.println("Which teacher[index] do you want to remove/delete?");
			
		//	ts.deleteTeacher(sc.nextInt());		//in one line
			
			int index = sc.nextInt();	//two line ma
			ts.deleteTeacher(index);
			
			
			//get teacher after delete
			getAll();
		}
	}
}
