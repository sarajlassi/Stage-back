package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.CompteBank;


@Repository
public interface CompteBankDao extends CrudRepository<CompteBank, String> {

}
