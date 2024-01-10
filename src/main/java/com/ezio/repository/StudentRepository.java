package com.ezio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezio.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
