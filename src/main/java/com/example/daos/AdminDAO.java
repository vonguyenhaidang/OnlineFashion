package com.example.daos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.AdminMap;
import com.example.models.Admin;

@Repository
@Transactional
public class AdminDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Admin> getAdmins(){
		List<Admin> a=jdbcTemplate.query("select * from tblAdmin", new AdminMap());
		return a;
	}
	public List<Admin> getAdmindetail(){
		List<Admin> a=jdbcTemplate.query("select adminID,adminName,adminPassword from tblAdmin", new AdminMap());
		return a;
	}
	public void addAdmin(Admin a) {
		jdbcTemplate.update("insert into tblAdmin values(?,?,?,?)"
				, new Object[] {a.getAdminID(),a.getAdminName(),a.getAdminEmail(),a.getAdminPassword()});
	}
	public void delAdmin(String id) {
		jdbcTemplate.update("delete from tblAdmin where adminID=?",new Object[] {id});
	}
	public void updAdmin(Admin a) {
		jdbcTemplate.update("update tblAdmin set adminName=?, adminEmail=?, adminPassword=?",new Object[] {a.getAdminName()
				,a.getAdminEmail(),a.getAdminPassword()});
	}
}
