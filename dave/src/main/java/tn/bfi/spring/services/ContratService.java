package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ContratDao;
import tn.bfi.spring.entities.Contrat;


@Service
public class ContratService {
	
	@Autowired
	public ContratDao contratDao;
	
	public List<Contrat> getAllContrats()   
	{  
		List<Contrat> contrat = new ArrayList<Contrat>();  
		contratDao.findAll().forEach(contrat1 -> contrat.add(contrat1));  
		return contrat;  
	}  

	public Contrat getContratById(int idContrat)   
	{  
		return contratDao.findById(idContrat).get();  
	}  

	public void saveOrUpdate(Contrat contrat)   
	{  
		contratDao.save(contrat);  
	}  

	public void delete(int idContrat)   
	{  
		contratDao.deleteById(idContrat);  
	}  

	public void update(Contrat contrat, int idContrat)   
	{  
		contratDao.save(contrat);  
	}  


}
