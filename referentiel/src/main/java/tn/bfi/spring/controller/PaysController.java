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

import tn.bfi.spring.entities.Pays;
import tn.bfi.spring.services.PaysService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class PaysController {

	@Autowired
	public PaysService paysService;
	

	
	@GetMapping("/pays")  
	private List<Pays> getAllPays()   
	{  
		return paysService.getAllPays();  
	}  

	@GetMapping("/pays/{idPays}")  
	private Pays getPays(@PathVariable("idPays") int idPays)   
	{  
		return paysService.getPaysById(idPays);  
	}  

	@DeleteMapping("/pays/{idPays}")  
	private void deletePays(@PathVariable("idPays") @RequestParam int idPays)   
	{  
		paysService.delete(idPays);  
	}  

	@PostMapping("/pays")  
	private int saveBook(@RequestBody Pays pays)   
	{  
		paysService.saveOrUpdate(pays);  
		return pays.getIdPays();  
	}  

	@PutMapping("/pays")  
	private Pays update(@RequestBody Pays pays)   
	{  
		paysService.saveOrUpdate(pays);  
		return pays;  
	} 

}
