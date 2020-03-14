package com.cts.emart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.beans.Login;
import com.cts.emart.beans.Seller;
import com.cts.emart.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository rep;
	
	public void addLogin(Login login){
		rep.save(login);
		
	}
}
