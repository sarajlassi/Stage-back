package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.AgenceDao;
import tn.bfi.spring.entities.Agence;

@Service
public class AgenceService {
	
	@Autowired
	public AgenceDao agenceDao;
	
	public List<Agence> getAllAgences()   
	{  
		List<Agence> agence = new ArrayList<Agence>();  
		agenceDao.findAll().forEach(agence1 -> agence.add(agence1));  
		return agence;  
	}  

	public Agence getAgenceById(int id)   
	{  
		return agenceDao.findById(id).get();  
	}  

	public void saveOrUpdate(Agence agence)   
	{  
		agenceDao.save(agence);  
	}  

	public void delete(int id)   
	{  
		agenceDao.deleteById(id);  
	}  

	public void update(Agence agence, int idAgence)   
	{  
		agenceDao.save(agence);  
	}  

}
