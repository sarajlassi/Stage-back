package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ClientMoralDao;
import tn.bfi.spring.entities.ClientMoral;

@Service
public class ClientMoralService {

	@Autowired
	public ClientMoralDao clientMoralDao;

	public List<ClientMoral> getAllClientMorals()   
	{  
		List<ClientMoral> clientMoral = new ArrayList<ClientMoral>();  
		clientMoralDao.findAll().forEach(clientMoral1 -> clientMoral.add(clientMoral1));  
		return clientMoral;  
	}  

	public ClientMoral getClientMoralById(int idClient)   
	{  
		return clientMoralDao.findById(idClient).get();  
	}  

	public void saveOrUpdate(ClientMoral clientMoral)   
	{  
		clientMoralDao.save(clientMoral);  
	}  

	public void delete(int idClient)   
	{  
		clientMoralDao.deleteById(idClient);  
	}  

	public void update(ClientMoral clientMoral, int idClient)   
	{  
		clientMoralDao.save(clientMoral);  
	}  

}
