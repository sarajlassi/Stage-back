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

import tn.bfi.spring.entities.ClientMoral;
import tn.bfi.spring.services.ClientMoralService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ClientMoralController {

	@Autowired
	public ClientMoralService clientMoralService;
	

	
	@GetMapping("/client-moral")  
	private List<ClientMoral> getAllClientMorals()   
	{  
		return clientMoralService.getAllClientMorals();  
	}  

	@GetMapping("/client-moral/{idClient}")  
	private ClientMoral getClientMoral(@PathVariable("idClient") int idClient)   
	{  
		return clientMoralService.getClientMoralById(idClient);  
	}  

	@DeleteMapping("/client-moral/{idClient}")  
	private void deleteClientMoral(@PathVariable("idClient") @RequestParam int idClient)   
	{  
		clientMoralService.delete(idClient);  
	}  

	@PostMapping("/client-moral")  
	private int saveClientMoral(@RequestBody ClientMoral clientMoral)   
	{  
		clientMoralService.saveOrUpdate(clientMoral);  
		return clientMoral.getIdClient();  
	}  

	@PutMapping("/client-moral")  
	private ClientMoral update(@RequestBody ClientMoral clientMoral)   
	{  
		clientMoralService.saveOrUpdate(clientMoral);  
		return clientMoral;  
	} 

}
