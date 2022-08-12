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

import tn.bfi.spring.entities.CreditPret;
import tn.bfi.spring.services.CreditPretService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CreditPretController {
	
	@Autowired
	public CreditPretService creditPretService;
	

	
	@GetMapping("/credit-pret")  
	private List<CreditPret> getAllCreditPrets()   
	{  
		return creditPretService.getAllCreditPrets();  
	}  

	@GetMapping("/credit-pret/{idContrat}")  
	private CreditPret getCreditPret(@PathVariable("idContrat") int idContrat)   
	{  
		return creditPretService.getCreditPretById(idContrat);  
	}  

	@DeleteMapping("/credit-pret/{idContrat}")  
	private void deleteCreditPret(@PathVariable("idContrat") @RequestParam int idContrat)   
	{  
		creditPretService.delete(idContrat);  
	}  

	@PostMapping("/credit-pret")  
	private int saveCreditPret(@RequestBody CreditPret creditPret)   
	{  
		creditPretService.saveOrUpdate(creditPret);  
		return creditPret.getIdContrat();  
	}  

	@PutMapping("/credit-pret")  
	private CreditPret update(@RequestBody CreditPret creditPret)   
	{  
		creditPretService.saveOrUpdate(creditPret);  
		return creditPret;  
	} 

}
