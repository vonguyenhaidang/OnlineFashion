package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.CustomerDAO;
import com.example.models.Customer;

@Service
public class CustomerServ {
	@Autowired
	private CustomerDAO cd;
	
	public List<Customer> getCustomers(){
		return cd.getCustomers();
	}
}
