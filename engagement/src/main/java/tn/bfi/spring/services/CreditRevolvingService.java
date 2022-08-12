package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.CreditRevolvingDao;
import tn.bfi.spring.entities.CreditRevolving;

@Service
public class CreditRevolvingService {
	
	@Autowired
	public CreditRevolvingDao creditRevolvingDao;

	public List<CreditRevolving> getAllCreditRevolvings()   
	{  
		List<CreditRevolving> creditRevolving = new ArrayList<CreditRevolving>();  
		creditRevolvingDao.findAll().forEach(creditRevolving1 -> creditRevolving.add(creditRevolving1));  
		return creditRevolving;  
	}  

	public CreditRevolving getCreditRevolvingById(int idContrat)   
	{  
		return creditRevolvingDao.findById(idContrat).get();  
	}  

	public void saveOrUpdate(CreditRevolving creditRevolving)   
	{  
		creditRevolvingDao.save(creditRevolving);  
	}  

	public void delete(int idContrat)   
	{  
		creditRevolvingDao.deleteById(idContrat);  
	}  

	public void update(CreditRevolving creditRevolving, int idContrat)   
	{  
		creditRevolvingDao.save(creditRevolving);  
	}  

}
