package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.DetailsDAO;
import com.example.models.Details;

@Service
public class DetailsServ {
	@Autowired
	private DetailsDAO dd;
	
	public List<Details> getDetails(){
		return dd.getDetails();
	}
}
