package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.ContratCredit;

@Repository
public interface ContratCreditDao extends CrudRepository<ContratCredit, Integer> {

}
