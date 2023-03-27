package com.example.daos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.StylistMap;
import com.example.models.Stylist;

@Repository
@Transactional
public class StylistDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Stylist> getStylists(){
		List<Stylist> c=jdbcTemplate.query("select * from tblStylist", new StylistMap());
		return c;
	}
	
	public void addStyl(final Stylist s) {
		jdbcTemplate.update("insert into tblStylist values(?,?,?,?,?)",new Object[] {s.getStylistID(),s.getStylistName(),
				s.getStylistEmail(),s.getStylistDesc(),s.getStylistPassword()});
	}
	
	public void delStyl(final String stylID) {
		jdbcTemplate.update("delete tblStylist where stylID=?",new Object[] {stylID});
	}
}
