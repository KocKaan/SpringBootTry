package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
	
	@GetMapping
	public String getStudent(){
		Student std=new Student(1L,"Mariam", 21, LocalDate.of(2000,Month.JANUARY,5),"mariam43@gmail.com");
		return std.toString();
	}
	


}
