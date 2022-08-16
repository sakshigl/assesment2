package com.globallogic.SuperAdmin.superadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.globallogic.SuperAdmin.superadmin.entity.CustomerEntity;

import com.globallogic.SuperAdmin.superadmin.repo.CustomerRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerRepo cusRepo;
	
	@GetMapping("/")
	public List<CustomerEntity >getCust() {
		return cusRepo.findAll();
	}
	
	@PostMapping("/")
	public List<CustomerEntity> saveCust(@RequestBody CustomerEntity cusEntity){
		
		cusRepo.save(cusEntity);
		return cusRepo.findAll();
	}

	@PutMapping("/")
    public List<CustomerEntity> updateDept(@RequestBody CustomerEntity cusEntity){
		
		cusRepo.save(cusEntity);
		return cusRepo.findAll();
	}
	
	
}
