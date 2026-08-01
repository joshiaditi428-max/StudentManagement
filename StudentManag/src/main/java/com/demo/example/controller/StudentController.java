package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.entity.Student;
import com.demo.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	
	@PostMapping("stdDetail")
	public String StdDetail(@RequestBody Student s) {
		
		ss.saveStudent(s);
		return "saved";
		
		
		
	}

}
