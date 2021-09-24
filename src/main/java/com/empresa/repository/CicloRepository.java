package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Ciclo;

public interface CicloRepository extends JpaRepository<Ciclo, Integer>{
	
	
	// @Query("select distinct x.idCiclo from Ciclo x order by 1 asc")
	// public abstract List<String> listaCiclo();
	

}
