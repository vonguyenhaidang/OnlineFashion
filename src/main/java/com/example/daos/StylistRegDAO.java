package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.ProductMap;
import com.example.mapper.StylistMap;
import com.example.mapper.StylistRegMap;
import com.example.models.Products;
import com.example.models.Stylist;
import com.example.models.StylistReg;

@Repository
@Transactional
public class StylistRegDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<StylistReg> getStylistRegs(){
		List<StylistReg> sr=jdbcTemplate.query("select * from tblStylist", new StylistRegMap());
		return sr;
	}
	
	public StylistReg getStylistReg(final String id) {
		StylistReg sr=jdbcTemplate.queryForObject("select * from tblStylistReg where stylRegID=?", new StylistRegMap(),id);
		return sr;
	}
	
	public void updStylistReg(final String id, final String status) {
		jdbcTemplate.update("update tblStylistReg set status=? where stylRegID=?",new Object[] {status,id});
	}
}
