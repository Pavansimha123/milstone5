package com.college.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.college.service.entity.College;

@Repository
public interface Collegerepo extends JpaRepository<College,Long>
{

	College findBycollegeid(Long collegeid);
	@Query("SELECT CASE WHEN COUNT(c) >0 THEN TRUE ELSE FALSE END FROM College c WHERE c.collegeid= ?1")
    Boolean iscollegeexistbyid(Long id);

	
	
}
