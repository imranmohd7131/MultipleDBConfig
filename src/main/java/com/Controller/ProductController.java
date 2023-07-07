package com.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiple_db.entities.Product;
import com.multiple_db.repo.ProductRepo;
import com.multiple_db2.entities.User;
import com.multiple_db2.repo.UserRepo;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/getPro")
	public void get() {
		System.out.println("product id::"+productRepo.findById(1));
		Product pro=productRepo.findById(10).get();
		
		User obj=new User();
		obj.setId(pro.getId());
		obj.setFirstname(pro.getName());
		userRepo.save(obj);
		
	}

}
