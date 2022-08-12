package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.SoldeCompte;


@Repository
public interface SoldeCompteDao extends CrudRepository<SoldeCompte, Integer> {

}
