package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.StylistDAO;
import com.example.models.Stylist;

@Service
public class StylistServ {
	@Autowired
	private StylistDAO sd;
	
	public List<Stylist> getStylists(){
		return sd.getStylists();
	}
}
