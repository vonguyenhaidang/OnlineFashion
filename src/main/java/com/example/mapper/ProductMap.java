package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Cat;
import com.example.models.Products;

public class ProductMap implements RowMapper<Products>{

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Products p=new Products();
		p.setProdID(rs.getString("prodID"));
		p.setProdName(rs.getString("prodName"));
		p.setProdPrice(rs.getFloat("prodPrice"));
		p.setProdDesc(rs.getString("prodDesc"));
		p.setAvailable(rs.getBoolean("available"));
		Cat c=new Cat();
		c.setCatID(rs.getString("catID"));
		p.setProdcat(c);
		return p;
	}

}
