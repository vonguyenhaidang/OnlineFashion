package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Details;

import mapper.DetailsMap;

@Repository
@Transactional
public class DetailsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Details> getDetails(){
		List<Details> d=jdbcTemplate.query("select * from tblDetails", new DetailsMap());
		return d;
	}
}
