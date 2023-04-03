package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.AdminDAO;
import com.example.models.Admin;

@Service
public class AdminServ {
	@Autowired
	private AdminDAO ad;
	
	public List<Admin> getAdmins(){
		return ad.getAdmins();
	}
	public void addAdmin(Admin a) {
		ad.addAdmin(a);
	}
	public void delAdmin(String id) {
		ad.delAdmin(id);
	}
	public void updAdmin(Admin a) {
		ad.updAdmin(a);
	}
}
