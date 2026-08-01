package com.demo.example.service;

import com.demo.example.entity.Student;

public interface StudentService {
	
	void saveStudent(Student s);
	
	void deleteStudent(int id);
	
	Student getStudent(int id);

}
