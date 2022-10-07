package com.Student.college.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.college.VO.ResponseTemplate;
import com.Student.college.entity.Student;
import com.Student.college.service.StudentService;

@RestController
@RequestMapping("/student")
public class Controller
{
	@Autowired
   private StudentService studentservice;
	
	@PostMapping("/savestudent")
	public Student savestudent(@RequestBody Student student)
	{
		return studentservice.savestudent(student);
	}
	
	@GetMapping("/")
	public List<Student> getallstudents()
	{
		return studentservice.getallstudents();
	}
	
	@GetMapping("/{id}")
	public Student getbyid(@PathVariable("id") Long studentid)
	{
		return this.studentservice.getbyid(studentid);
	}
	
	@GetMapping("/college/{id}")
	public ResponseTemplate getstudentwithcollege(@PathVariable("id") Long studentid)
	{
		return studentservice.getstudentwithcollege(studentid);
	}
	@GetMapping("/getdesc/{age}")
	public List<Student> getstudentsindesc(@PathVariable("age") String age){
		return this.studentservice.getstudentsindescage(age);
	
	}
}
