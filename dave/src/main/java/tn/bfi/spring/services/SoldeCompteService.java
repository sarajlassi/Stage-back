package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.SoldeCompteDao;
import tn.bfi.spring.entities.SoldeCompte;

@Service
public class SoldeCompteService {
	
	@Autowired
	public SoldeCompteDao soldeCompteDao;
	
	public List<SoldeCompte> getAllSoldeComptes()   
	{  
		List<SoldeCompte> soldeCompte = new ArrayList<SoldeCompte>();  
		soldeCompteDao.findAll().forEach(soldeCompte1 -> soldeCompte.add(soldeCompte1));  
		return soldeCompte;  
	}  

	public SoldeCompte getSoldeCompteById(int idSoldeCompte)   
	{  
		return soldeCompteDao.findById(idSoldeCompte).get();  
	}  

	public void saveOrUpdate(SoldeCompte soldeCompte)   
	{  
		soldeCompteDao.save(soldeCompte);  
	}  

	public void delete(int idSoldeCompte)   
	{  
		soldeCompteDao.deleteById(idSoldeCompte);  
	}  

	public void update(SoldeCompte soldeCompte, int idSoldeCompte)   
	{  
		soldeCompteDao.save(soldeCompte);  
	}  


}
