package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Products;

import mapper.ProductMap;

@Repository
@Transactional
public class ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Products> getProducts(){
		List<Products> p=jdbcTemplate.query("select * from tblProducts", new ProductMap());
		return p;
	}
	
	public Products getProduct(final String prodID) {
		Products p=jdbcTemplate.queryForObject("select * from tblProducts", new ProductMap(),prodID);
		return p;
	}
	
	
}
