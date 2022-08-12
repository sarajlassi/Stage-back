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

import tn.bfi.spring.entities.CompteBank;
import tn.bfi.spring.services.CompteBankService;



@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CompteBankController {

	@Autowired
	public CompteBankService compteBankService;
	

	
	@GetMapping("/compteBank")  
	private List<CompteBank> getAllCompteBanks()   
	{  
		return compteBankService.getAllCompteBanks();  
	}  

	@GetMapping("/compteBank/{numCompte}")  
	private CompteBank getCompteBank(@PathVariable("numCompte") String numCompte)   
	{  
		return compteBankService.getCompteBankById(numCompte);  
	}  

	@DeleteMapping("/compteBank/{numCompte}")  
	private void deleteCompteBank(@PathVariable("numCompte")  @RequestParam String numCompte)   
	{  
		compteBankService.delete(numCompte);  
	}  

	@PostMapping("/compteBank")  
	private String saveCompteBank(@RequestBody CompteBank compteBank)   
	{  
		compteBankService.saveOrUpdate(compteBank);  
		return compteBank.getNumCompte();  
	}  

	@PutMapping("/compteBank")  
	private CompteBank update(@RequestBody CompteBank compteBank)   
	{  
		compteBankService.saveOrUpdate(compteBank);  
		return compteBank;  
	} 

}
