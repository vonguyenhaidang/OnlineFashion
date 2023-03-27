package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.CustomerPayment;

public class CustomerPaymentMap implements RowMapper<CustomerPayment>{

	@Override
	public CustomerPayment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		CustomerPayment cp=new CustomerPayment();
		cp.setPaymentID(rs.getString("paymentID"));
		cp.setPayType(rs.getString("payType"));
		cp.setProvider(rs.getString("provider"));
		cp.setAccNum(rs.getInt("accNum"));
		cp.setExpiryDate(rs.getDate("expiryDate"));
		return cp;
	}

}
