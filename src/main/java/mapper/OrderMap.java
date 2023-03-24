package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Customer;
import com.example.models.CustomerPayment;
import com.example.models.Order;

public class OrderMap implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Order o=new Order();
		CustomerPayment cp=new CustomerPayment();
		Customer c=new Customer();
		
		cp.setPaymentID(rs.getString("paymentID"));
		c.setUserID(rs.getString("userID"));
		
		o.setOrderID(rs.getString("orderID"));
		o.setUser(c);
		o.setTotalPrice(rs.getFloat("totalPrice"));
		o.setCusPay(cp);
		o.setStatus(rs.getString("status"));
		
		return o;
	}

}
