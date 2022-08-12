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

import tn.bfi.spring.entities.CreditRevolving;
import tn.bfi.spring.services.CreditRevolvingService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CreditRevolvingController {
	
	@Autowired
	public CreditRevolvingService creditRevolvingService;
	

	
	@GetMapping("/credit-revolving")  
	private List<CreditRevolving> getAllCreditRevolvings()   
	{  
		return creditRevolvingService.getAllCreditRevolvings();  
	}  

	@GetMapping("/credit-revolving/{idContrat}")  
	private CreditRevolving getCreditRevolving(@PathVariable("idContrat") int idContrat)   
	{  
		return creditRevolvingService.getCreditRevolvingById(idContrat);  
	}  

	@DeleteMapping("/credit-revolving/{idContrat}")  
	private void deleteCreditRevolving(@PathVariable("idContrat") @RequestParam int idContrat)   
	{  
		creditRevolvingService.delete(idContrat);  
	}  

	@PostMapping("/credit-revolving")  
	private int saveCreditRevolving(@RequestBody CreditRevolving creditRevolving)   
	{  
		creditRevolvingService.saveOrUpdate(creditRevolving);  
		return creditRevolving.getIdContrat();  
	}  

	@PutMapping("/credit-revolving")  
	private CreditRevolving update(@RequestBody CreditRevolving creditRevolving)   
	{  
		creditRevolvingService.saveOrUpdate(creditRevolving);  
		return creditRevolving;  
	} 


}
