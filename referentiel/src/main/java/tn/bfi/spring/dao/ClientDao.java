package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Client;


@Repository
public interface ClientDao extends CrudRepository<Client, Integer> {

}
