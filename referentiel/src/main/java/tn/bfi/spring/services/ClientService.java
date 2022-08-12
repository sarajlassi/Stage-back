package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ClientDao;
import tn.bfi.spring.entities.Client;

@Service
public class ClientService {
	
	@Autowired
	public ClientDao clientDao;
	
	public List<Client> getAllClients()   
	{  
		List<Client> client = new ArrayList<Client>();  
		clientDao.findAll().forEach(client1 -> client.add(client1));  
		return client;  
	}  

	public Client getClientById(int idClient)   
	{  
		return clientDao.findById(idClient).get();  
	}  

	public void saveOrUpdate(Client client)   
	{  
		clientDao.save(client);  
	}  

	public void delete(int idClient)   
	{  
		clientDao.deleteById(idClient);  
	}  

	public void update(Client client, int idClient)   
	{  
		clientDao.save(client);  
	}  

	/*
	public Client registerClient(Client client) {
		return clientDao.save(client);
	}
	
	public List<Client> getClients(){
		return (List<Client>) clientDao.findAll();		 
	}
	
	public void deleteClient(int idClient) {
		clientDao.deleteById(idClient);
	}
	
	public Client updateClient(Client client) {
		int idClient = client.getIdClient();
		Client clt = clientDao.findById(idClient).get();
		clt.setPays(client.getPays());
		return clientDao.save(clt);
	}
*/
}
