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

import tn.bfi.spring.entities.ContratCredit;
import tn.bfi.spring.services.ContratCreditService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ContratCreditController {
	
	@Autowired
	public ContratCreditService contratCreditService;
	

	
	@GetMapping("/contrat-credit")  
	private List<ContratCredit> getAllContratCredits()   
	{  
		return contratCreditService.getAllContratCredits();  
	}  

	@GetMapping("/contrat-credit/{idContrat}")  
	private ContratCredit getContratCredit(@PathVariable("idContrat") int idContrat)   
	{  
		return contratCreditService.getContratCreditById(idContrat);  
	}  

	@DeleteMapping("/contrat-credit/{idContrat}")  
	private void deleteContratCredit(@PathVariable("idContrat") @RequestParam int idContrat)   
	{  
		contratCreditService.delete(idContrat);  
	}  

	@PostMapping("/contrat-credit")  
	private int saveContratCredit(@RequestBody ContratCredit contratCredit)   
	{  
		contratCreditService.saveOrUpdate(contratCredit);  
		return contratCredit.getIdContrat();  
	}  

	@PutMapping("/contrat-credit")  
	private ContratCredit update(@RequestBody ContratCredit contratCredit)   
	{  
		contratCreditService.saveOrUpdate(contratCredit);  
		return contratCredit;  
	} 

}
