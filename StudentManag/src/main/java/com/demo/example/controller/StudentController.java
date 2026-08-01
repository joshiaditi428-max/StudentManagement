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
	
<<<<<<< HEAD
	@PostMapping("test/studentmanagement/stdDetail")
=======
	@PostMapping("stdDetail")
>>>>>>> 10bbe4d3aaee75de76e4e8e80c3b37d2257a5876
	public String StdDetail(@RequestBody Student s) {
		
		ss.saveStudent(s);
		return "saved";
		
		
		
	}

}
