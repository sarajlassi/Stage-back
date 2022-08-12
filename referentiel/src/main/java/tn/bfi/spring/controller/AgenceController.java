package tn.bfi.spring.controller;

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

import tn.bfi.spring.entities.Agence;
import tn.bfi.spring.services.AgenceService;

import java.util.*;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AgenceController {
	
	@Autowired
	public AgenceService agenceService;
	

	
	@GetMapping("/agence")  
	private List<Agence> getAllAgences()   
	{  
		return agenceService.getAllAgences();  
	}  

	@GetMapping("/agence/{idAgence}")  
	private Agence getAgence(@PathVariable("idAgence") int idAgence)   
	{  
		return agenceService.getAgenceById(idAgence);  
	}  

	@DeleteMapping("/agence/{idAgence}")  
	private void deleteAgence(@PathVariable("idAgence") @RequestParam int idAgence)   
	{  
		agenceService.delete(idAgence);  
	}  

	@PostMapping("/agence")  
	private int saveAgence(@RequestBody Agence agence)   
	{  
		agenceService.saveOrUpdate(agence);  
		return agence.getIdAgence();  
	}  

	@PutMapping("/agence")  
	private Agence update(@RequestBody Agence agence)   
	{  
		agenceService.saveOrUpdate(agence);  
		return agence;  
	} 

}
