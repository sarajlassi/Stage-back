package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ContratCompteDao;
import tn.bfi.spring.entities.ContratCompte;

@Service
public class ContratCompteService {
	@Autowired
	public ContratCompteDao contratCompteDao;

	public List<ContratCompte> getAllContratComptes()   
	{  
		List<ContratCompte> contratCompte = new ArrayList<ContratCompte>();  
		contratCompteDao.findAll().forEach(contratCompte1 -> contratCompte.add(contratCompte1));  
		return contratCompte;  
	}  

	public ContratCompte getContratCompteById(int idContrat)   
	{  
		return contratCompteDao.findById(idContrat).get();  
	}  

	public void saveOrUpdate(ContratCompte contratCompte)   
	{  
		contratCompteDao.save(contratCompte);  
	}  

	public void delete(int idContrat)   
	{  
		contratCompteDao.deleteById(idContrat);  
	}  

	public void update(ContratCompte contratCompte, int idContrat)   
	{  
		contratCompteDao.save(contratCompte);  
	}  


}
