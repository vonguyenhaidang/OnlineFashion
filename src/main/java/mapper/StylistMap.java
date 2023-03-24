package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Stylist;

public class StylistMap implements RowMapper<Stylist>{

	@Override
	public Stylist mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Stylist s=new Stylist();
		s.setStylistID(rs.getString("stylName"));
		s.setStylistName(rs.getString("stylName"));
		s.setStylistEmail(rs.getString("stylEmail"));
		s.setStylistDesc(rs.getString("stylDesc"));
		s.setStylistPassword(rs.getString("stylPassword"));
		return s;
	}

}
