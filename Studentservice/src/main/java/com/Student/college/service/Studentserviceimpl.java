package com.Student.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.Student.college.VO.College;
import com.Student.college.VO.ResponseTemplate;
import com.Student.college.entity.Student;
import com.Student.college.repository.Studentrepo;

@Component
public class Studentserviceimpl implements StudentService {

	@Autowired
	private Studentrepo studentrepo;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@Override
	public Student savestudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}


	@Override
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}


	@Override
	public Student getbyid(Long studentid) {
		// TODO Auto-generated method stub
		return studentrepo.findBystudentid(studentid);
	}


	@Override
	public ResponseTemplate getstudentwithcollege(Long studentid) {
		// TODO Auto-generated method stub
		ResponseTemplate vo= new ResponseTemplate();
		Student student= studentrepo.findBystudentid(studentid);
		//College college= resttemplate.getForObject("http://localhost:9090/college/"+3, College.class);
		vo.setCollege(resttemplate.getForObject("http://COLLEGE-SERVICE/college/"+student.getCollegeid(), College.class));
		vo.setStudent(student);
		return vo;
	}


	@Override
	public List<Student> getstudentsindescage(String age) {
		// TODO Auto-generated method stub
		return this.studentrepo.findAll(Sort.by(Sort.Direction.DESC,age));
	}

}
