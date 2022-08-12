package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.CompteBancaireDao;
import tn.bfi.spring.entities.CompteBancaire;

@Service
public class CompteBancaireService {
	
	@Autowired
	public CompteBancaireDao compteBancaireDao;
	
	public List<CompteBancaire> getAllCompteBancaires()   
	{  
		List<CompteBancaire> compteBancaire = new ArrayList<CompteBancaire>();  
		compteBancaireDao.findAll().forEach(compteBancaire1 -> compteBancaire.add(compteBancaire1));  
		return compteBancaire;  
	}  

	public CompteBancaire getCompteBancaireById(String numCpt)   
	{  
		return compteBancaireDao.findById(numCpt).get();  
	}  

	public void saveOrUpdate(CompteBancaire compteBancaire)   
	{  
		compteBancaireDao.save(compteBancaire);  
	}  

	public void delete(String numCpt)   
	{  
		compteBancaireDao.deleteById(numCpt);  
	}  

	public void update(CompteBancaire compteBancaire, String numCpt)   
	{  
		compteBancaireDao.save(compteBancaire);  
	}  


}
