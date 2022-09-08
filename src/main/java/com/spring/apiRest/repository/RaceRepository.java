package com.spring.apiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.apiRest.model.Race;

public interface RaceRepository extends JpaRepository<Race, Long>{
	
	@Query("select r from Race r where r.idAthlete=?1")
	List<Race> findByAthlete(Long id);	
	

}
