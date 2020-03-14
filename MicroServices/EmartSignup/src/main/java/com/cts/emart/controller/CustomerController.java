package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.beans.Contact;
import com.cts.emart.beans.Customers;
import com.cts.emart.beans.Login;
import com.cts.emart.beans.Seller;
import com.cts.emart.services.ContactService;
import com.cts.emart.services.CustomerService;
import com.cts.emart.services.LoginService;
import com.cts.emart.services.SellerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {

	@Autowired 
	CustomerService service;
	
	@Autowired
	SellerService service1;
	
	@Autowired
	ContactService service2;
	
	@Autowired
	LoginService service3;

	@RequestMapping("/allusers")
	public List<Customers> getAll() {
		return (List<Customers>) service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/allusers")
	public void addCustomer(@RequestBody Customers customer) {
		
		service.addCustomer(customer);
	}
	
	@RequestMapping("/allusers/{customerId}")
	public Optional<Customers> getDetailsById(@PathVariable int customerId) {
		
		return service.getDetailsById(customerId);
	}
	
	//seller controller
	
	
	@RequestMapping("/allsellers")
	public List<Seller> getAllSellers() {
		return service1.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/allsellers")
	public void addSeller(@RequestBody Seller seller) {
		
		service1.addSeller(seller);
	}
	
	@RequestMapping("/allsellers/{sellerId}")
	public Optional<Seller> getAllDetailsById(@PathVariable int sellerId) {
		
		return service1.getAllDetailsById(sellerId);
	}
	
	
	/* Contact Us Controller */
	
	@RequestMapping("/contact")
	public List<Contact> getAllContacts() {
		return service2.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/contact")
	public void addContact(@RequestBody Contact contact) {
		
		service2.addContact(contact);
	}
	
	//Login
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public void addLogin(@RequestBody Login login) {
		
		service3.addLogin(login);
	}
}
