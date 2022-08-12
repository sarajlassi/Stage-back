package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.bfi.spring.entities.ClientMoral;

@Repository
public interface ClientMoralDao extends CrudRepository<ClientMoral, Integer> {
	
	ClientMoral findByMatricule(String matricule);
	

}
