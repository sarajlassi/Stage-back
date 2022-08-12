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

import tn.bfi.spring.entities.Contrat;
import tn.bfi.spring.services.ContratService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ContratController {
	
	@Autowired
	public ContratService contratService;
	

	
	@GetMapping("/contrat")  
	private List<Contrat> getAllAContrats()   
	{  
		return contratService.getAllContrats();  
	}  

	@GetMapping("/contrat/{idContrat}")  
	private Contrat getContrat(@PathVariable("idContrat") int idContrat)   
	{  
		return contratService.getContratById(idContrat);  
	}  

	@DeleteMapping("/contrat/{idContrat}")  
	private void deleteContrat(@PathVariable("idContrat") @RequestParam int idContrat)   
	{  
		contratService.delete(idContrat);  
	}  

	@PostMapping("/contrat")  
	private int saveContrat(@RequestBody Contrat contrat)   
	{  
		contratService.saveOrUpdate(contrat);  
		return contrat.getIdContrat();  
	}  

	@PutMapping("/contrat")  
	private Contrat update(@RequestBody Contrat contrat)   
	{  
		contratService.saveOrUpdate(contrat);  
		return contrat;  
	} 


}
