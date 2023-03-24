package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Cat;

import mapper.CatMap;

@Repository
@Transactional
public class CatDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Cat> getCats(){
		List<Cat> c= jdbcTemplate.query("select * from tblCategory", new CatMap());
		return c;
	}
}
