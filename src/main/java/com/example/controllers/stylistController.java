package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.models.Admin;
import com.example.models.Cat;
import com.example.models.Customer;
import com.example.models.CustomerPayment;
import com.example.models.Details;
import com.example.models.Order;
import com.example.models.Products;
import com.example.models.Stylist;
import com.example.models.StylistReg;
import com.example.service.CatServ;
import com.example.service.CustomerServ;
import com.example.service.ProductServ;
import com.example.service.StylistServ;

@Controller
public class stylistController {
	@Autowired
	private CatServ cas;
	@Autowired
	private CustomerServ cs;
	@Autowired
	private ProductServ ps;
	@Autowired
	private StylistServ ss;
	
	@GetMapping("stylist")
	public String adminPage(ModelMap models) {
		List<Stylist> s=ss.getStylists();
		List<Cat> ca=cas.getCats();
		List<Customer> cu=cs.getCustomers();
		List<Products> p=ps.getProducts();

		models.addAttribute("Stylists", s);
		models.addAttribute("Cats", ca);
		models.addAttribute("Customers", cu);
		models.addAttribute("Products", p);
		
		return "stylist";
	}
}
