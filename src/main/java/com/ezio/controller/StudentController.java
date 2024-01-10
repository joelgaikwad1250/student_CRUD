package com.ezio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ezio.entity.Student;
import com.ezio.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ser;

	@PostMapping("/Save-Student")
	public String Save( @RequestBody Student s)
	{
		System.out.println(s);
		ser.SaveStudent(s);
		return "Save";
	}
	
	@GetMapping("/Read-Student")
	public List<Student>getStudent()
	{
		return ser.getStudents();
		
	}
	
	@GetMapping("/Find-by-id/{id}")
	public Student getStudent(@PathVariable("id") Long id)
	{
		return ser. getStudent1(id);
		
	}
	@DeleteMapping("/Delete-by-id/{id}")
	public Student delStudent(@PathVariable("id") Long id)
	{
		return ser.delStudent1(id);
	}
	 
	@PutMapping("/Update-by-id/")
	public String updStudent( @RequestBody Student s)
	{
		ser.updStudent2(s);
		return "save";
	}
	
	

}
