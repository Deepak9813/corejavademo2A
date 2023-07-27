package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentServiceImpl implements StudentService{
	
	static List<Student> slist = new ArrayList<>();

	@Override
	public void addStudent(Student s) {
		slist.add(s);
		System.out.println("=======Successfully added========== Size = "+slist.size());
		
	}

	@Override
	public void deleteStudent(int index) {
		slist.remove(index);
		
	}

	@Override
	public List<Student> getAllStudent() {
		return slist;
	}

}
