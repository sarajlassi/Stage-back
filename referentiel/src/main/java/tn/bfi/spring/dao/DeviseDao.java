package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Devise;

@Repository
public interface DeviseDao extends CrudRepository<Devise, Integer> {

}
