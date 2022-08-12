package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.PaysDao;
import tn.bfi.spring.entities.Pays;

@Service
public class PaysService {

	@Autowired
	public PaysDao paysDao;
	
	public List<Pays> getAllPays()   
	{  
		List<Pays> pays = new ArrayList<Pays>();  
		paysDao.findAll().forEach(pays1 -> pays.add(pays1));  
		return pays;  
	}  

	public Pays getPaysById(int idPays)   
	{  
		return paysDao.findById(idPays).get();  
	}  

	public void saveOrUpdate(Pays pays)   
	{  
		paysDao.save(pays);  
	}  

	public void delete(int idPays)   
	{  
		paysDao.deleteById(idPays);  
	}  

	public void update(Pays pays, int idPays)   
	{  
		paysDao.save(pays);  
	}  

}
