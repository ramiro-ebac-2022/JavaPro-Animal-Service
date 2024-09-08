package br.com.zavala.animal_service.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.zavala.animal_service.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{
	@Query("Select a From Animal a Where a.dataAdocao Is Null Order By a.dataEntrada Desc")
	List<Animal> findNotAdopted();
	
	@Query("Select a From Animal a Where a.dataAdocao Is Not Null Order By a.dataAdocao Desc")
	List<Animal> findAdopted();
}
