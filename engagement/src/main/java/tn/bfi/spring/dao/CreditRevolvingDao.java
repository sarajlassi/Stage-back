package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.CreditRevolving;


@Repository
public interface CreditRevolvingDao extends CrudRepository<CreditRevolving, Integer> {

}
