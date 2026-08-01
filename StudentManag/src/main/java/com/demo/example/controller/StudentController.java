package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.entity.Student;
import com.demo.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
//	Story-01
	@PostMapping("student/stdDetail")
	public String StdDetail(@RequestBody Student s) {
		
		ss.saveStudent(s);
		return "saved";
		
		
 		
	}
	
	@GetMapping("getstudent/{id}")
	Student getstudent(@PathVariable int id) {
		
		Student s=ss.getStudent(id);
		
		return s;
		
		
		
	}

}
