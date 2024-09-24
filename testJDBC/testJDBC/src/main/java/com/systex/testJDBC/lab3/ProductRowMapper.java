package com.systex.testJDBC.lab3;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowCount) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setDescription(rs.getString("desc"));
		return product;
	}

}
