package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.StylistReg;

public class StylistRegMap implements RowMapper<StylistReg>{

	@Override
	public StylistReg mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		StylistReg sr=new StylistReg();
		sr.setStylistRegID(rs.getString("stylRegID"));
		sr.setStylistRegID(rs.getString("stylRegName"));
		sr.setStylistRegID(rs.getString("stylRegEmail"));
		sr.setStylistRegID(rs.getString("stylRegDesc"));
		sr.setStylistRegID(rs.getString("stylRegPassword"));
		sr.setStylistRegID(rs.getString("status"));
		return sr;
	}

}
