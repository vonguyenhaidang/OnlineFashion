package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.CustomerPaymentDAO;
import com.example.models.CustomerPayment;

@Service
public class CustomerPaymentServ {
	@Autowired
	private CustomerPaymentDAO cpd;
	
	public List<CustomerPayment> getCustPays(){
		return cpd.getCustPays();
	}
}
