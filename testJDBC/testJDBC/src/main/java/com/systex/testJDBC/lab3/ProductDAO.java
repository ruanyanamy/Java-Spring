package com.systex.testJDBC.lab3;

import java.util.List;

public interface ProductDAO {
	
	public Product getProduct(int id);
	
	public List<Product> getProducts();

	public int insert(Product product);
	
	public void update(Product product);
}
