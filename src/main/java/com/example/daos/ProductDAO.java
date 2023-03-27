package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.ProductMap;
import com.example.models.Cat;
import com.example.models.Products;

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
		Products p=jdbcTemplate.queryForObject("select * from tblProducts where prodID=?", new ProductMap(),prodID);
		return p;
	}
	
	public List<Products> getReccomendedProd(final String catID) {
		List<Products> p=jdbcTemplate.query("select * from tblProducts where catID in (select catID from tblCategory where catID=?)",new ProductMap(),catID);
		return p;
	}
	
	public String getCatID(final String prodID) {
		Products c=jdbcTemplate.queryForObject("select catID from tblProducts where prodID=?", new ProductMap(),prodID);
		Cat a=c.getProdcat();
		return a.getCatID();
	}
	
	public void addProd(final Products p) {
		int a=0;
		if(p.isAvailable()==true) {
			a=1;
		}
		jdbcTemplate.update("insert into tblProduct values(?,?,?,?,?,?)"
				, new Object[] {p.getProdID(),p.getProdName(),p.getProdPrice(),p.getProdDesc(),a,p.getProdcat().getCatID()});
	}
	
	public void delProd(final String prodid) {
		jdbcTemplate.update("delete from tblProducts where prodID=?",new Object[] {prodid});
	}
	
	public void updProd(final Products p) {
		int a=0;
		if(p.isAvailable()==true) {
			a=1;
		}
		jdbcTemplate.update("update tblProducts set prodName=?, prodPrice=?, prodDesc=?, available=?, catID=? where prodID=?",
				new Object[] {p.getProdName(),p.getProdPrice(),p.getProdDesc(),a,p.getProdcat().getCatID(),p.getProdID()});
	}
}
