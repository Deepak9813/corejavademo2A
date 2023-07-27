package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Teacher;

public class TeacherServiceImpl implements TeacherService{

	static List<Teacher> tlist = new ArrayList<>();
	
	@Override
	public void addTeacher(Teacher t) {
		tlist.add(t);
		System.out.println("==========Successfully Added=========== Size = "+tlist.size());
	}

	@Override
	public void deleteTeacher(int index) {
		tlist.remove(index);
		
	}

	@Override
	public List<Teacher> getAllTeacher() {
		
		return tlist;
	}

}
