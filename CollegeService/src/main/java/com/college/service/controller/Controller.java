package com.college.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.service.Service.CollegeserviceImpl;
import com.college.service.entity.College;

@RestController
@RequestMapping("/college")
public class Controller
{
	@Autowired
    private CollegeserviceImpl colgservice;
	
	@PostMapping("/savecollege")
	public College savecollege(@RequestBody College college )
	{
		return colgservice.savecollege(college);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getallcollege()
	{
		return ResponseEntity.ok(this.colgservice.getallcollege());
	}
	
	@GetMapping("/{id}")
	public College getcollegebyid(@PathVariable("id") Long collegeid)
	{
		 return colgservice.getcollegebyid(collegeid);
	}
	
	@GetMapping("/college/{field}")
	public List<College> getcollegeinasc(@PathVariable("field") String field){
		return this.colgservice.findcollegeinasc(field);
	}
}
