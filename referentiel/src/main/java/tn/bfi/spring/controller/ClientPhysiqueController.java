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

import tn.bfi.spring.entities.ClientPhysique;
import tn.bfi.spring.services.ClientPhysiqueService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ClientPhysiqueController {
	
	@Autowired
	public ClientPhysiqueService clientPhysiqueService;
	

	
	@GetMapping("/client-physique")  
	private List<ClientPhysique> getAllClientPhysiques()   
	{  
		return clientPhysiqueService.getAllClientPhysiques();  
	}  

	@GetMapping("/client-physique/{idClient}")  
	private ClientPhysique getClientPhysique(@PathVariable("idClient") int idClient)   
	{  
		return clientPhysiqueService.getClientPhysiqueById(idClient);  
	}  
	
	@GetMapping("/client-physique-cin/{cin}")  
	private ClientPhysique getClientPhysiqueCin(@PathVariable("cin") String cin)   
	{  
		return clientPhysiqueService.getClientPhysiqueByCin(cin);  
	}  


	@DeleteMapping("/client-physique/{idClient}")  
	private void deleteClientPhysique(@PathVariable("idClient") @RequestParam int idClient)   
	{  
		clientPhysiqueService.delete(idClient);  
	}  
	
	@DeleteMapping("/client-physiqueCin/{cin}")  
	private void deleteClientPhysiqueCin(@PathVariable("cin") @RequestParam String cin)   
	{  
		ClientPhysique clientPhysique= getClientPhysiqueCin(cin);
		deleteClientPhysique(clientPhysique.getIdClient());
		//clientPhysiqueService.deleteByCin(cin);
	}  

	@PostMapping("/client-physique")  
	private int saveClientPhysique(@RequestBody ClientPhysique clientPhysique)   
	{  
		clientPhysiqueService.saveOrUpdate(clientPhysique);  
		return clientPhysique.getIdClient();  
	}  

	@PutMapping("/client-physique")  
	private ClientPhysique update(@RequestBody ClientPhysique clientPhysique)   
	{  
		clientPhysiqueService.saveOrUpdate(clientPhysique);  
		return clientPhysique;  
	} 

}
