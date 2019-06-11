package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
		Product p=repo.save(new Product("A",1.1));
		System.out.println(p.getProdId());
		Product p2=repo.save(new Product("B",2.1));
		System.out.println(p2.getProdId());
		Product p3=repo.save(new Product("C",3.1));
		System.out.println(p3.getProdId());
	}

}
