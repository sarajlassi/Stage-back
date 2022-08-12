package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.Contact;

@Repository
public interface ContactDao extends CrudRepository<Contact, Integer> {

}
