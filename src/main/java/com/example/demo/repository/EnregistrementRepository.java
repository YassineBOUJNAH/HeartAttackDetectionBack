package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.modele.Enregistrement;

@RepositoryRestResource
public interface EnregistrementRepository extends CrudRepository<Enregistrement, Long> {
	
	@Query("SELECT e FROM Enregistrement e WHERE e.id = (SELECT MAX(id) FROM Enregistrement)")
	Enregistrement findEnregistrementActuel();
	
	@Query("SELECT count(e) FROM Enregistrement e")
	int findCountEnregistrements();
	
	@Query("SELECT target FROM Enregistrement")
	List<Integer> findScoreData();

}
