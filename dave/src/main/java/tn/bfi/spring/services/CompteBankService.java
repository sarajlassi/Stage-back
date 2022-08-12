package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.CompteBankDao;
import tn.bfi.spring.entities.CompteBank;



@Service
public class CompteBankService {

	@Autowired
	public CompteBankDao compteBankDao;
	
	public List<CompteBank> getAllCompteBanks()   
	{  
		List<CompteBank> compteBank = new ArrayList<CompteBank>();  
		compteBankDao.findAll().forEach(compteBank1 -> compteBank.add(compteBank1));  
		return compteBank;  
	}  

	public CompteBank getCompteBankById(String numCompte)   
	{  
		return compteBankDao.findById(numCompte).get();  
	}  

	public void saveOrUpdate(CompteBank compteBank)   
	{  
		compteBankDao.save(compteBank);  
	}  

	public void delete(String numCompte)   
	{  
		compteBankDao.deleteById(numCompte);  
	}  

	public void update(CompteBank compteBank, String numCompte)   
	{  
		compteBankDao.save(compteBank);  
	}  

}
