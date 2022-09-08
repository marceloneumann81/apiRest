package com.spring.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.apiRest.model.PersonalBest;

public interface PersonalBestRepository extends JpaRepository<PersonalBest, Long>{	
	
	@Query("select pb from personalbest pb where pb.idAthlete=?1")
	public PersonalBest findByAthlete(Long id);
	
}
