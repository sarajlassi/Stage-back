package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.CreditPretDao;
import tn.bfi.spring.entities.CreditPret;

@Service
public class CreditPretService {
	
	@Autowired
	public CreditPretDao creditPretDao;

	public List<CreditPret> getAllCreditPrets()   
	{  
		List<CreditPret> creditPret = new ArrayList<CreditPret>();  
		creditPretDao.findAll().forEach(creditPret1 -> creditPret.add(creditPret1));  
		return creditPret;  
	}  

	public CreditPret getCreditPretById(int idContrat)   
	{  
		return creditPretDao.findById(idContrat).get();  
	}  

	public void saveOrUpdate(CreditPret creditPret)   
	{  
		creditPretDao.save(creditPret);  
	}  

	public void delete(int idContrat)   
	{  
		creditPretDao.deleteById(idContrat);  
	}  

	public void update(CreditPret creditPret, int idContrat)   
	{  
		creditPretDao.save(creditPret);  
	}  

}
