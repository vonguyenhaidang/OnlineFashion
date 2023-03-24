package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Customer;

public class CustomerMap implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setUserID(rs.getString("userID"));
		c.setUserName(rs.getString("userName"));
		c.setUserFName(rs.getString("userFname"));
		c.setUserLName(rs.getString("userLname"));
		c.setUserEmail(rs.getString("userEmail"));
		c.setUserPassword(rs.getString("userPassword"));
		c.setUserAddress(rs.getString("address"));
		return c;
	}

}
