package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Details;
import com.example.models.Order;
import com.example.models.Products;

public class DetailsMap implements RowMapper<Details>{

	@Override
	public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Details d=new Details();
		Products p=new Products();
		Order o=new Order();
		
		p.setProdID(rs.getString("prodID"));
		o.setOrderID(rs.getString("orderID"));
		
		d.setOrder(o);
		d.setProd(p);
		d.setQuantity(rs.getInt("quantity"));
		
		return d;
	}

}
