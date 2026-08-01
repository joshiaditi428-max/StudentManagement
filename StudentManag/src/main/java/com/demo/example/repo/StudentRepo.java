package com.demo.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
