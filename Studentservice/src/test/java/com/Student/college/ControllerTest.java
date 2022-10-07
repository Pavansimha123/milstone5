package com.Student.college;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.Student.college.Controller.Controller;
import com.Student.college.VO.ResponseTemplate;
import com.Student.college.entity.Student;
import com.Student.college.service.StudentService;

@SpringBootTest(classes= {ControllerTest.class})
public class ControllerTest 
{
	@Mock
	StudentService studentservice;
	
	@InjectMocks
	Controller controller;
	
	List<Student> students;
	 Student student;
	 
	 @Test
	 public void testgetallstudents()
	 {
		 students = new ArrayList<Student>();
		 students.add(new Student(1L,"Pavan",23L,"Male","Java",3));
		 students.add(new Student(2L,"sush",23L,"Female","mern",3));
		 
		 when(studentservice.getallstudents()).thenReturn(students);
		 
		 List<Student> lst=controller.getallstudents();
		 
		 assertThat(lst.size()).isEqualTo(2);
	 }
	 
	 @Test
	 public void testgetbyid() 
	 {
		 student = new Student(1L,"Pavan",23L,"Male","Java",3);
		 Long Studentid=1L;
		 
		 when(studentservice.getbyid(Studentid)).thenReturn(student);
		 
		 Student stu= controller.getbyid(Studentid);
		 
		 assertThat(stu.getStudentid()).isEqualTo(1);
	 }
	
}