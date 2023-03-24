package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.models.Admin;
import com.example.models.CustomerPayment;
import com.example.models.Details;
import com.example.models.Stylist;
import com.example.models.Cat;
import com.example.models.Customer;
import com.example.models.Order;
import com.example.models.Products;

import service.AdminServ;
import service.CatServ;
import service.CustomerPaymentServ;
import service.CustomerServ;
import service.DetailsServ;
import service.OrderServ;
import service.ProductServ;
import service.StylistServ;


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
	
	@GetMapping("/product/{id}")
	public String prodDetail(@PathVariable String id,ModelMap models) {
		String c=ps.getCatID(id);
		Products p=ps.getProduct(id);
		List<Products> lp=ps.getRecommendProd(c);
		
		models.addAttribute("Recommend",lp);
		models.addAttribute("Product", p);
		
		return "product-details";
	}
}
