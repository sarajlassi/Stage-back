package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Pays;

@Repository
public interface PaysDao extends CrudRepository<Pays, Integer> {

}
