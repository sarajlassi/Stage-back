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

import tn.bfi.spring.entities.ContratCompte;
import tn.bfi.spring.services.ContratCompteService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ContratCompteController {
	
	@Autowired
	public ContratCompteService contratCompteService;
	

	
	@GetMapping("/contrat-compte")  
	private List<ContratCompte> getAllAContratComptes()   
	{  
		return contratCompteService.getAllContratComptes();  
	}  

	@GetMapping("/contrat-compte/{idContrat}")  
	private ContratCompte getContratCompte(@PathVariable("idContrat") int idContrat)   
	{  
		return contratCompteService.getContratCompteById(idContrat);  
	}  

	@DeleteMapping("/contrat-compte/{idContrat}")  
	private void deleteContratCompte(@PathVariable("idContrat") @RequestParam int idContrat)   
	{  
		contratCompteService.delete(idContrat);  
	}  

	@PostMapping("/contrat-compte")  
	private int saveContratCompte(@RequestBody ContratCompte contratCompte)   
	{  
		contratCompteService.saveOrUpdate(contratCompte);  
		return contratCompte.getIdContrat();  
	}  

	@PutMapping("/contrat-compte")  
	private ContratCompte update(@RequestBody ContratCompte contratCompte)   
	{  
		contratCompteService.saveOrUpdate(contratCompte);  
		return contratCompte;  
	} 


}
