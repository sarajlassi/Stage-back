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

import tn.bfi.spring.entities.SoldeCompte;
import tn.bfi.spring.services.SoldeCompteService;



@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class SoldeCompteController {
	
	@Autowired
	public SoldeCompteService soldeCompteService;
	

	
	@GetMapping("/soldeCompte")  
	private List<SoldeCompte> getAllSoldeComptes()   
	{  
		return soldeCompteService.getAllSoldeComptes();  
	}  

	@GetMapping("/soldeCompte/{idSoldeCompte}")  
	private SoldeCompte getContrat(@PathVariable("idSoldeCompte") int idSoldeCompte)   
	{  
		return soldeCompteService.getSoldeCompteById(idSoldeCompte);  
	}  

	@DeleteMapping("/soldeCompte/{idSoldeCompte}")  
	private void deleteSoldeCompte(@PathVariable("idSoldeCompte") @RequestParam int idSoldeCompte)   
	{  
		soldeCompteService.delete(idSoldeCompte);  
	}  

	@PostMapping("/soldeCompte")  
	private int saveSoldeCompte(@RequestBody SoldeCompte soldeCompte)   
	{  
		soldeCompteService.saveOrUpdate(soldeCompte);  
		return soldeCompte.getIdSoldeCompte();  
	}  

	@PutMapping("/soldeCompte")  
	private SoldeCompte update(@RequestBody SoldeCompte soldeCompte)   
	{  
		soldeCompteService.saveOrUpdate(soldeCompte);  
		return soldeCompte;  
	} 



}
