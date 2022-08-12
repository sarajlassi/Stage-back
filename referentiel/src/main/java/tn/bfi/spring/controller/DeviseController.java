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

import tn.bfi.spring.entities.Devise;
import tn.bfi.spring.services.DeviseService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class DeviseController {
	
	@Autowired
	public DeviseService deviseService;
	

	
	@GetMapping("/devise")  
	private List<Devise> getAllDevises()   
	{  
		return deviseService.getAllDevises();  
	}  

	@GetMapping("/devise/{idDevise}")  
	private Devise getDevise(@PathVariable("idDevise") int idDevise)   
	{  
		return deviseService.getDeviseById(idDevise);  
	}  

	@DeleteMapping("/devise/{idDevise}")  
	private void deleteDevise(@PathVariable("idDevise") @RequestParam int idDevise)   
	{  
		deviseService.delete(idDevise);  
	}  

	@PostMapping("/devise")  
	private int saveDevise(@RequestBody Devise devise)   
	{  
		deviseService.saveOrUpdate(devise);  
		return devise.getIdDevise();  
	}  

	@PutMapping("/devise")  
	private Devise update(@RequestBody Devise devise)   
	{  
		deviseService.saveOrUpdate(devise);  
		return devise;  
	} 


}
