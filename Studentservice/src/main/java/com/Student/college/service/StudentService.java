package com.Student.college.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.college.VO.ResponseTemplate;
import com.Student.college.entity.Student;

@Service
public interface StudentService
{

	Student savestudent(Student student);

	List<Student> getallstudents();

	Student getbyid(Long studentid);

	ResponseTemplate getstudentwithcollege(Long studentid);

	List<Student> getstudentsindescage(String age);

}
