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

import tn.bfi.spring.entities.Contact;
import tn.bfi.spring.services.ContactService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ContactController {

	@Autowired
	public ContactService contactService;
	

	
	@GetMapping("/contact")  
	private List<Contact> getAllContacts()   
	{  
		return contactService.getAllContacts();  
	}  

	@GetMapping("/contact/{idContact}")  
	private Contact getContact(@PathVariable("idContact") int idContact)   
	{  
		return contactService.getContactById(idContact);  
	}  

	@DeleteMapping("/contact/{idContact}")  
	private void deleteContact(@PathVariable("idContact") @RequestParam int idContact)   
	{  
		contactService.delete(idContact);  
	}  

	@PostMapping("/contact")  
	private int saveContact(@RequestBody Contact contact)   
	{  
		contactService.saveOrUpdate(contact);  
		return contact.getIdContact();  
	}  

	@PutMapping("/contact")  
	private Contact update(@RequestBody Contact contact)   
	{  
		contactService.saveOrUpdate(contact);  
		return contact;  
	} 

}
