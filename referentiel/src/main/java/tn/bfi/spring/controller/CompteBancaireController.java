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

import tn.bfi.spring.entities.CompteBancaire;
import tn.bfi.spring.services.CompteBancaireService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CompteBancaireController {

	@Autowired
	public CompteBancaireService compteBancaireService;
	

	
	@GetMapping("/compteBancaire")  
	private List<CompteBancaire> getAllCompteBancaires()   
	{  
		return compteBancaireService.getAllCompteBancaires();  
	}  

	@GetMapping("/compteBancaire/{numCpt}")  
	private CompteBancaire getCompteBancaire(@PathVariable("numCpt") String numCpt)   
	{  
		return compteBancaireService.getCompteBancaireById(numCpt);  
	}  

	@DeleteMapping("/compteBancaire/{numCpt}")  
	private void deleteCompteBancaire(@PathVariable("numCpt") @RequestParam String numCpt)   
	{  
		compteBancaireService.delete(numCpt);  
	}  

	@PostMapping("/compteBancaire")  
	private String saveCompteBancaire(@RequestBody CompteBancaire compteBancaire)   
	{  
		compteBancaireService.saveOrUpdate(compteBancaire);  
		return compteBancaire.getNumCpt();  
	}  

	@PutMapping("/compteBancaire")  
	private CompteBancaire update(@RequestBody CompteBancaire compteBancaire)   
	{  
		compteBancaireService.saveOrUpdate(compteBancaire);  
		return compteBancaire;  
	} 

}
