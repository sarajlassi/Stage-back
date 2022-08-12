package tn.bfi.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.ContactDao;
import tn.bfi.spring.entities.Contact;

@Service
public class ContactService {
	
	@Autowired
	public ContactDao contactDao;
	
	public List<Contact> getAllContacts()   
	{  
		List<Contact> contact = new ArrayList<Contact>();  
		contactDao.findAll().forEach(contact1 -> contact.add(contact1));  
		return contact;  
	}  

	public Contact getContactById(int idContact)   
	{  
		return contactDao.findById(idContact).get();  
	}  

	public void saveOrUpdate(Contact contact)   
	{  
		contactDao.save(contact);  
	}  

	public void delete(int idContact)   
	{  
		contactDao.deleteById(idContact);  
	}  

	public void update(Contact contact, int idContact)   
	{  
		contactDao.save(contact);  
	}  


}
