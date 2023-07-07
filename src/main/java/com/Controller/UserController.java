package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	com.multiple_db2.repo.UserRepo userRepo;

	@GetMapping("/get")
	public void get() {
	System.out.println("user id::"+userRepo.findById(1));
		
	}

}
