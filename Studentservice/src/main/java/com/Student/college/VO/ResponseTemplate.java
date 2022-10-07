package com.Student.college.VO;

import com.Student.college.entity.Student;

public class ResponseTemplate {

	private College college;
	private Student student;
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ResponseTemplate(College college, Student student) {
		super();
		this.college = college;
		this.student = student;
	}

	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResponseTemplate [college=" + college + ", student=" + student + "]";
	}
	
	
}
