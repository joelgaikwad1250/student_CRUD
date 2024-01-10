package com.ezio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezio.entity.Student;
import com.ezio.repository.StudentRepository;

@Service

public class StudentService 
{
@Autowired StudentRepository rep;
public void SaveStudent( Student s)
{
	rep.save(s);
	}

  public List<Student> getStudents()
  {
	return rep.findAll();
	  
  }
  
  public Student getStudent1(Long id)
  {
	return rep.findById(id).get();
	  
  }
  public Student delStudent1(Long id)
  {
	 rep.deleteById(id);
	 return null;
  }
  public void updStudent2(Student s)
  {
	  rep.save(s);
	  
  }
}

