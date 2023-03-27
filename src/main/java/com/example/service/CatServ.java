package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.CatDAO;
import com.example.models.Cat;

@Service
public class CatServ {
	@Autowired
	private CatDAO cd;
	
	public List<Cat> getCats(){
		return cd.getCats();
	}
	
	public void addCat(final Cat c) {
		cd.addCat(c);
	}
	public void delCat(final String catid) {
		cd.delCat(catid);
	}
	
	public void updCat(final Cat c) {
		cd.updCat(c);
	}
}
