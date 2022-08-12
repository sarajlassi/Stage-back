package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ClientPhysiqueDao;
import tn.bfi.spring.entities.ClientPhysique;

@Service
public class ClientPhysiqueService {
	
	@Autowired
	public ClientPhysiqueDao clientPhysiqueDao;
	
	public List<ClientPhysique> getAllClientPhysiques()   
	{  
		List<ClientPhysique> clientPhysique = new ArrayList<ClientPhysique>();  
		clientPhysiqueDao.findAll().forEach(clientPhysique1 -> clientPhysique.add(clientPhysique1));  
		return clientPhysique;  
	}  

	public ClientPhysique getClientPhysiqueById(int idClient)   
	{  
		return clientPhysiqueDao.findById(idClient).get();  
	}  
	
	public ClientPhysique getClientPhysiqueByCin(String cin)   
	{  
		return clientPhysiqueDao.findByCin(cin); 
	}  

	public void saveOrUpdate(ClientPhysique clientPhysique)   
	{  
		clientPhysiqueDao.save(clientPhysique);  
	}  

	public void delete(int idClient)   
	{  
		clientPhysiqueDao.deleteById(idClient);  
	}  
	
	public void deleteByCin(String cin)   
	{  
		clientPhysiqueDao.deleteByCin(cin);  
	}  
	
	
	public void update(ClientPhysique clientPhysique, int idClient)   
	{  
		clientPhysiqueDao.save(clientPhysique);  
	}
}
