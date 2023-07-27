package com.service;

import java.util.List;

import com.model.Teacher;

public interface TeacherService {

	void addTeacher(Teacher t);
	void deleteTeacher(int index);
	List<Teacher>  getAllTeacher();
	
}
