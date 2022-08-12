package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.DeviseDao;
import tn.bfi.spring.entities.Devise;

@Service
public class DeviseService {
	
	@Autowired
	public DeviseDao deviseDao;
	
	public List<Devise> getAllDevises()   
	{  
		List<Devise> devise = new ArrayList<Devise>();  
		deviseDao.findAll().forEach(devise1 -> devise.add(devise1));  
		return devise;  
	}  

	public Devise getDeviseById(int idDevise)   
	{  
		return deviseDao.findById(idDevise).get();  
	}  

	public void saveOrUpdate(Devise devise)   
	{  
		deviseDao.save(devise);  
	}  

	public void delete(int idDevise)   
	{  
		deviseDao.deleteById(idDevise);  
	}  

	public void update(Devise devise, int idDevise)   
	{  
		deviseDao.save(devise);  
	}  


}
