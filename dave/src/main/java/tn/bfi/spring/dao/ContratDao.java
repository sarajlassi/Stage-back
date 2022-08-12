package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Contrat;


@Repository
public interface ContratDao extends CrudRepository<Contrat, Integer> {

}
