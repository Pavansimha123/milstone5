package com.college.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.college.service.entity.College;
import com.college.service.repo.Collegerepo;

@Service
public class CollegeserviceImpl  {

	@Autowired
    private Collegerepo collegerepo;

	public College savecollege(College college)
	{
		// TODO Auto-generated method stub
		return collegerepo.save(college);
	}

	
	public List<College> getallcollege() {
		// TODO Auto-generated method stub
		return this.collegerepo.findAll();
	}

	
	public College getcollegebyid(Long collegeid) {
		// TODO Auto-generated method stub
		//return collegerepo.getcollegebyid(id);
		return collegerepo.findBycollegeid(collegeid);
	}
	
	public List<College> findcollegeinasc(String field){
		return this.collegerepo.findAll(Sort.by(Sort.Direction.ASC, field));
	}

}
