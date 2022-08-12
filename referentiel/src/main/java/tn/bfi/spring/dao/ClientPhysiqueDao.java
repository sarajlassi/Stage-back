package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.ClientPhysique;

@Repository
public interface ClientPhysiqueDao extends CrudRepository<ClientPhysique, Integer>{
	ClientPhysique findByCin(String cin);
	void deleteByCin(String cin);

}
