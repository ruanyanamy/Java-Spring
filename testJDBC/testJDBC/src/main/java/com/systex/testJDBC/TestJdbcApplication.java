package com.systex.testJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.systex.testJDBC.lab3.Product;
import com.systex.testJDBC.lab3.ProductDAO;

@SpringBootApplication
public class TestJdbcApplication implements CommandLineRunner {

	@Autowired
	private ProductDAO productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setName("Elephant");
		product.setDescription("this is an elephant");
		//System.out.println(this.productDao.insert(product));  新增資料
		
		this.productDao.getProducts().forEach(p->System.out.println(p));
		System.out.println("=============================");
		System.out.println(productDao.getProduct(1));
		System.out.println(productDao.getProduct(2));
		//System.out.println(productDao.getProduct(3));
		
		
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setName("Lion");
		p1.setDescription("this is a lion");
		
		productDao.update(p1);
		System.out.println("=============================");
		this.productDao.getProducts().forEach(p->System.out.println(p));
	}

}
