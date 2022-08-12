package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.CreditPret;

@Repository
public interface CreditPretDao extends CrudRepository<CreditPret, Integer> {

}
