package com.example.daos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Stylist;

import mapper.StylistMap;

@Repository
@Transactional
public class StylistDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Stylist> getStylists(){
		List<Stylist> c=jdbcTemplate.query("select * from tblStylist", new StylistMap());
		return c;
	}
}
