package com.cts.emart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.beans.Contact;
import com.cts.emart.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository rep;
	
	public List<Contact> getAll() {
		
		return (List<Contact>) rep.findAll();
	}

	public void addContact(Contact contact) {
		rep.save(contact);
	}

}
