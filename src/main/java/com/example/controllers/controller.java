package com.example.controllers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.Admin;
import com.example.models.CustomerPayment;
import com.example.models.Details;
import com.example.models.Stylist;
import com.example.service.AdminServ;
import com.example.service.CatServ;
import com.example.service.CustomerPaymentServ;
import com.example.service.CustomerServ;
import com.example.service.DetailsServ;
import com.example.service.OrderServ;
import com.example.service.ProductServ;
import com.example.service.StylistServ;
import com.example.models.Cat;
import com.example.models.Customer;
import com.example.models.Order;
import com.example.models.Products;


@Controller
public class controller {
	@Autowired
	private AdminServ as;
	private CatServ cas;
	private CustomerPaymentServ cps;
	private CustomerServ cs;
	private DetailsServ ds;
	private OrderServ os;
	private ProductServ ps;
	private StylistServ ss;
	
	//Password md5 encryption
	public static String MD5(String s) throws Exception {
	      MessageDigest m=MessageDigest.getInstance("MD5");
	      m.update(s.getBytes(),0,s.length());     
	      return new BigInteger(1,m.digest()).toString(16); 
	}
	
	//Admin home page with all table values sent to admin.jsp file
	@GetMapping("admin")
	public String adminPage(ModelMap models) {
		List<Admin> a=as.getAdmins();
		List<CustomerPayment> cp=cps.getCustPays();
		List<Details> d=ds.getDetails();
		List<Stylist> s=ss.getStylists();
		List<Cat> ca=cas.getCats();
		List<Customer> cu=cs.getCustomers();
		List<Order> o=os.getOrders();
		List<Products> p=ps.getProducts();
		
		models.addAttribute("Admins", a);
		models.addAttribute("CustPays", cp);
		models.addAttribute("Details", d);
		models.addAttribute("Stylists", s);
		models.addAttribute("Cats", ca);
		models.addAttribute("Customers", cu);
		models.addAttribute("Orders", o);
		models.addAttribute("Products", p);
		
		return "admin";
	}
	
	
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
	
	@PostMapping("/admin/product/add")
	public String addProd(@RequestParam(value="ID",required=true) String prodid,@RequestParam(value="available",required=true) boolean available,
			@RequestParam(value="name",required=true) String prodname,@RequestParam(value="price",required=true) float price,
			@RequestParam(value="desc",required=true) String desc,@RequestParam(value="cat",required=true) String catid,ModelMap models) {
		
		Products p=new Products();
		Cat c=new Cat();
		
		c.setCatID(catid);
		
		p.setProdID(prodid);
		p.setProdName(prodname);
		p.setProdPrice(price);
		p.setProdDesc(desc);
		p.setAvailable(available);
		p.setProdcat(c);
		
		ps.addProd(p);
		
		List<Products> lp=ps.getProducts();
		models.addAttribute("product", lp);
		
		return "redirect:/admin";
	}
	
	@PostMapping("/admin/product/update")
	public String updProd(@RequestParam(value="ID",required=true) String prodid,@RequestParam(value="available",required=true) boolean available,
			@RequestParam(value="name",required=true) String prodname,@RequestParam(value="price",required=true) float price,
			@RequestParam(value="desc",required=true) String desc,@RequestParam(value="cat",required=true) String catid,ModelMap models) {
		
		Products p=new Products();
		Cat c=new Cat();
		
		c.setCatID(catid);
		
		p.setProdID(prodid);
		p.setProdName(prodname);
		p.setProdPrice(price);
		p.setProdDesc(desc);
		p.setAvailable(available);
		p.setProdcat(c);
		
		ps.updProd(p);
		
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/delete/product/{id}")
	public String delProd(@PathVariable String id,ModelMap models) {
		ps.delProd(id);
		
		List<Products> lp=ps.getProducts();
		models.addAttribute("product",lp);
		
		return "redirect:/admin";
	}
	
	@PostMapping("/admin/category/add")
	public String addCat(@RequestParam(value="ID",required=true) String catid,@RequestParam(value="name",required=true) String catname
			,@RequestParam(value="desc") String desc,ModelMap models) {
		Cat c=new Cat();
		c.setCatID(catid);
		c.setCatName(catname);
		c.setCatDesc(desc);
		
		cas.addCat(c);
		
		return "redirect:/admin";
	}
	
	@PostMapping("admin/category/update")
	public String updCat(@RequestParam(value="ID",required=true) String catid,@RequestParam(value="name",required=true) String catname
			,@RequestParam(value="desc") String desc,ModelMap models) {
		Cat c=new Cat();
		c.setCatID(catid);
		c.setCatName(catname);
		c.setCatDesc(desc);
		
		cas.updCat(c);
		
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/delete/category/{id}")
	public String delCat(@PathVariable String id, ModelMap models) {
		cas.delCat(id);

		List<Products> lp=ps.getProducts();
		models.addAttribute("product",lp);
		
		List<Cat> lc=cas.getCats();
		models.addAttribute("category", lc);
		
		return "redirect:/admin";
	}
	
	@PostMapping("/admin/stylist/add")
	public String addStyl(@RequestParam(value="ID",required=true) String stylid,@RequestParam(value="name",required=true) String stylname,
			@RequestParam(value="email",required=true) String email,@RequestParam(value="desc",required=true) String desc,
			@RequestParam(value="password",required=true) String password,ModelMap models) throws Exception {
		Stylist s=new Stylist();
		
		String p=MD5(password);
		
		s.setStylistID(stylid);
		s.setStylistName(stylname);
		s.setStylistEmail(email);
		s.setStylistDesc(desc);
		s.setStylistPassword(p);
		
		ss.addStyl(s);
		
		List<Stylist> ls=ss.getStylists();
		models.addAttribute("stylist", ls);
		
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/delete/stylist/{id}")
	public String delStyl(@PathVariable String id,ModelMap models) {
		ss.delStyl(id);
		
		List<Stylist> ls=ss.getStylists();
		models.addAttribute("stylist", ls);
		
		return "redirect:/admin";
	}
}
