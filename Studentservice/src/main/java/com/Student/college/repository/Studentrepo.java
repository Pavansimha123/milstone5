package com.Student.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.college.entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Long>
{


	Student findBystudentid(Long studentid);

}
