package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.StylistRegDAO;
import com.example.models.StylistReg;

@Service
public class StylistRegServ {
	@Autowired
	private StylistRegDAO srd;
	
	public List<StylistReg> getStylistRegs(){
		return srd.getStylistRegs();
	}
	
	public StylistReg getStylistReg(final String id) {
		return srd.getStylistReg(id);
	}
	
	public void updStylistReg(final String id,final String status) {
		srd.updStylistReg(id, status);
	}
}
