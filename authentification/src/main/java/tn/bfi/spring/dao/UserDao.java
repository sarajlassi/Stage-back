package tn.bfi.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.bfi.spring.entities.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
	

}
