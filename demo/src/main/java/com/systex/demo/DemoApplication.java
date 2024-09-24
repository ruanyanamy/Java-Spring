package com.systex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.systex.demo.model.IProduct;
import com.systex.demo.model.Product;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired // @Qualifier("Cat")
	private Product p;
	
	public static void main(String[] args) {
		System.out.println("Start Spring Boot Application");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("End Spring Boot Application"); 
	}
	
//	@Bean
//	@Scope("prototype")
//	public Product abc() {       //Factory Method
//		Product p = new Product();
//		p.setId(10001);
//		p.setName("iPhone16 Pro");
//		p.setDescription("Comming soon....");
//		
//		return p;
//	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Glue Code Start--------------------
//		ApplicationContext container = new AnnotationConfigApplicationContext(DemoApplication.class);
//		Product p1 = container.getBean(Product.class);
//		Product p2 = container.getBean(Product.class);
//		//Glue Code End----------------------
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1 == p2);  //預設的Scope是Singleton
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDescription() );
	}

}
