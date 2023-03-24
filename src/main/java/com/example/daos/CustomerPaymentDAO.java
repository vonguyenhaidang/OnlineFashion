package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.CustomerPayment;

import mapper.CustomerPaymentMap;

@Repository
@Transactional
public class CustomerPaymentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<CustomerPayment> getCustPays(){
		List<CustomerPayment> cp=jdbcTemplate.query("select * from tblCustPay", new CustomerPaymentMap());
		return cp;
	}
}
