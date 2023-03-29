package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.OrderMap;
import com.example.models.Order;

@Repository
@Transactional
public class OrderDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Order> getOrders(){
		List<Order> o= jdbcTemplate.query("select * from tblOrder", new OrderMap());
		return o;
	}
	
	public void updOrd(Order o) {
		jdbcTemplate.update("update tblOrder set status=? where orderID=?",new Object[] {o.getStatus(),o.getOrderID()});
	}
}
