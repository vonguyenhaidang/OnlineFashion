package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.OrderDAO;
import com.example.models.Order;

@Service
public class OrderServ {
	@Autowired
	private OrderDAO od;
	
	public List<Order> getOrders(){
		return od.getOrders();
	}
}
