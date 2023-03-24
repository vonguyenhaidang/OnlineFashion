package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Order;

import mapper.OrderMap;

@Repository
@Transactional
public class OrderDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Order> getOrders(){
		List<Order> o= jdbcTemplate.query("select * from tblOrder", new OrderMap());
		return o;
	}
}
