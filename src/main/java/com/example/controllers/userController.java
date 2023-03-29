package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.models.Cat;
import com.example.models.Products;
import com.example.service.AdminServ;
import com.example.service.CatServ;
import com.example.service.CustomerPaymentServ;
import com.example.service.CustomerServ;
import com.example.service.DetailsServ;
import com.example.service.OrderServ;
import com.example.service.ProductServ;
import com.example.service.StylistServ;

public class userController {
	@Autowired
	private AdminServ as;
	private CatServ cas;
	private CustomerPaymentServ cps;
	private CustomerServ cs;
	private DetailsServ ds;
	private OrderServ os;
	private ProductServ ps;
	private StylistServ ss;
	
	
	//Home page with all products and categories sent to index.jsp file
		@GetMapping("/")
		public String homePage(ModelMap models) {
			List<Products> p=ps.getProducts();
			List<Cat> ca=cas.getCats();
			
			models.addAttribute("Products",p);
			models.addAttribute("Cats", ca);
			
			return "index";
		}
		
		
		@PostMapping("/product/{id}")
		public String prodDetail(@PathVariable String id,ModelMap models) {
			String c=ps.getCatID(id);
			Products p=ps.getProduct(id);
			List<Products> lp=ps.getRecommendProd(c);
			
			models.addAttribute("Recommend",lp);
			models.addAttribute("Product", p);
			
			return "product-details";
		}

}
