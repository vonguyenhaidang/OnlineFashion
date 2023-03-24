package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Customer;

import mapper.CustomerMap;

@Repository
@Transactional
public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> getCustomers(){
		List<Customer> c=jdbcTemplate.query("select * from tblCustomer", new CustomerMap());
		return c;
	}
}
