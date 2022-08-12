package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Agence;

@Repository
public interface AgenceDao extends CrudRepository<Agence, Integer> {

}
