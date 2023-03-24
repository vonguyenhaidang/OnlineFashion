package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.models.Cat;

public class CatMap implements RowMapper<Cat>{

	@Override
	public Cat mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.setCatID(rs.getString("catID"));
		c.setCatName(rs.getString("catName"));
		c.setCatDesc(rs.getString("catDesc"));
		return c;
	}

}
