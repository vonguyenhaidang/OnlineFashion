package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Admin;

public class AdminMap implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Admin a=new Admin();
		a.setAdminID(rs.getString("adminID"));
		a.setAdminName(rs.getString("adminName"));
		a.setAdminEmail(rs.getString("adminEmail"));
		a.setAdminPassword(rs.getString("adminPassword"));
		return a;
	}

}
