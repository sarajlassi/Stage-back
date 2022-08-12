package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ContratCreditDao;
import tn.bfi.spring.entities.ContratCredit;

@Service
public class ContratCreditService {
	
	@Autowired
	public ContratCreditDao contratCreditDao;

	public List<ContratCredit> getAllContratCredits()   
	{  
		List<ContratCredit> contratCredit = new ArrayList<ContratCredit>();  
		contratCreditDao.findAll().forEach(contratCredit1 -> contratCredit.add(contratCredit1));  
		return contratCredit;  
	}  

	public ContratCredit getContratCreditById(int idContrat)   
	{  
		return contratCreditDao.findById(idContrat).get();  
	}  

	public void saveOrUpdate(ContratCredit contratCredit)   
	{  
		contratCreditDao.save(contratCredit);  
	}  

	public void delete(int idContrat)   
	{  
		contratCreditDao.deleteById(idContrat);  
	}  

	public void update(ContratCredit contratCredit, int idContrat)   
	{  
		contratCreditDao.save(contratCredit);  
	}  

}
