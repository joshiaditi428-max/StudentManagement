package com.demo.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.entity.Student;
import com.demo.example.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo repo;
	
	
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		
		repo.save(s);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		Student s=repo.findById(id).get();
		return s;
		
	}

}
