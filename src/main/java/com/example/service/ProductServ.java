package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.ProductDAO;
import com.example.models.Products;

@Service
public class ProductServ {
	@Autowired
	private ProductDAO pd;
	
	public List<Products> getProducts(){
		return pd.getProducts();
	}
	
	public List<Products> getRecommendProd(final String catid){
		return pd.getReccomendedProd(catid);
	}
	
	public Products getProduct(final String prodid) {
		return pd.getProduct(prodid);
	}
	
	public String getCatID(final String prodid) {
		return pd.getCatID(prodid);
	}
	
	public void addProd(final Products p) {
		pd.addProd(p);
	}
	
	public void delProd(final String proid) {
		pd.delProd(proid);
	}
	
	public void updProd(final Products p) {
		pd.updProd(p);
	}
}
