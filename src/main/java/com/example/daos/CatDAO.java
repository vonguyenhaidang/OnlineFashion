package com.example.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.CatMap;
import com.example.models.Cat;

@Repository
@Transactional
public class CatDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Cat> getCats(){
		List<Cat> c= jdbcTemplate.query("select * from tblCategory", new CatMap());
		return c;
	}
	
	public void addCat(final Cat c) {
		jdbcTemplate.update("insert into tblCategory values(?,?,?)",new Object[] {c.getCatID(),c.getCatName(),c.getCatDesc()});
	}
	
	public void delCat(final String catid) {
		jdbcTemplate.update("delete from tblProducts where catID=?",new Object[] {catid});
		jdbcTemplate.update("delete from tblCategory where catID=?",new Object[] {catid});
	}
	
	public void updCat(final Cat c) {
		jdbcTemplate.update("update tblCategory set catName=?, catDesc=? where catID=?",new Object[]{c.getCatName(),c.getCatDesc(),c.getCatID()});
	}
}
