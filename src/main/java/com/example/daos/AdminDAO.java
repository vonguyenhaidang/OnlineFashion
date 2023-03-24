package com.example.daos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Admin;

import mapper.AdminMap;

@Repository
@Transactional
public class AdminDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Admin> getAdmins(){
		List<Admin> a=jdbcTemplate.query("select * from tblAdmin", new AdminMap());
		return a;
	}
}
