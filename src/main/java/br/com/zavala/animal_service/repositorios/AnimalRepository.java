package br.com.zavala.animal_service.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.zavala.animal_service.dto.EspecieRacaDTO;
import br.com.zavala.animal_service.dto.RecebedorAnimalDTO;
import br.com.zavala.animal_service.entidades.Animal;
import br.com.zavala.animal_service.entidades.Especie;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{
	@Query("Select a From Animal a Where a.dataAdocao Is Null Order By a.dataEntrada Desc")
	List<Animal> findNotAdopted();
	
	@Query("Select a From Animal a Where a.dataAdocao Is Not Null Order By a.dataAdocao Desc")
	List<Animal> findAdopted();
	
	@Query("SELECT new br.com.zavala.animal_service.dto.RecebedorAnimalDTO(a.nomeRecebedor, COUNT(a.id)) " 
			+ " FROM Animal a GROUP BY a.nomeRecebedor")
	List<RecebedorAnimalDTO> listVolunteerAnimal();
	
	@Query("Select e From Especie e Order By nomeEspecie")
	List<Especie> findEspecie();
	
	@Query("SELECT new br.com.zavala.animal_service.dto.EspecieRacaDTO(r.id, e.id, e.nomeEspecie, r.nomeRaca, r.caracteristicas)" 
		    + " FROM Raca r JOIN Especie e ON r.idEspecie = e.id "
			+ " ORDER BY e.nomeEspecie, r.nomeRaca" )
	List<EspecieRacaDTO> listEspecieRaca();
	
}
