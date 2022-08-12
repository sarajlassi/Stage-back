package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.CompteBancaire;

@Repository
public interface CompteBancaireDao extends CrudRepository<CompteBancaire, String> {

}
