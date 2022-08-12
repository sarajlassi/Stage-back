package tn.bfi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.bfi.spring.entities.Client;
import tn.bfi.spring.services.ClientService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ClientController {
	
	@Autowired
	public ClientService clientService;

	@GetMapping("/client")  
	private List<Client> getAllClients()   
	{  
		return clientService.getAllClients();  
	}  

	@GetMapping("/client/{idClient}")  
	private Client getClient(@PathVariable("idClient") int idClient)   
	{  
		return clientService.getClientById(idClient);  
	}  

	@DeleteMapping("/client/{idClient}")  
	private void deleteClient(@PathVariable("idClient") @RequestParam int idClient)   
	{  
		clientService.delete(idClient);  
	}  

	@PostMapping("/client")  
	private int saveClient(@RequestBody Client client)   
	{  
		clientService.saveOrUpdate(client);  
		return client.getIdClient();  
	}  

	@PutMapping("/client")  
	private Client update(@RequestBody Client client)   
	{  
		clientService.saveOrUpdate(client);  
		return client;  
	} 

	/*
	@PostMapping("/client")
	public Client registerClient(@RequestBody Client client) {
		return clientService.registerClient(client);
	}
	
	@GetMapping("/getClients")
	public List<Client> getClients(){
		return clientService.getClients();		
	}
	
	@DeleteMapping("/deleteClient")
	public void deleteClient(@RequestParam int idClient) {
		clientService.deleteClient(idClient);
	}
	
	@PutMapping("/updateClients")
	public Client updateClient(@RequestBody Client client) {
		return  clientService.updateClient(client);
	}
*/
	

	

	

	

}
