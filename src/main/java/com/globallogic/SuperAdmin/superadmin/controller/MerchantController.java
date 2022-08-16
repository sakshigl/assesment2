package com.globallogic.SuperAdmin.superadmin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.SuperAdmin.superadmin.entity.MerchantEntity;
import com.globallogic.SuperAdmin.superadmin.repo.MerchantRepo;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	MerchantRepo mrepo;
	@GetMapping("/")
	public List<MerchantEntity >getMer() {
		return mrepo.findAll();
	}
	
	@PostMapping("/")
	public List<MerchantEntity> saveMer(@RequestBody MerchantEntity merEntity){
		
		mrepo.save(merEntity);
		return mrepo.findAll();
	}

	@PutMapping("/")
    public List<MerchantEntity> updateMer(@RequestBody MerchantEntity merEntity){
		
		mrepo.save(merEntity);
		return mrepo.findAll();
	}
	
	@DeleteMapping("/{id}")
    public List<MerchantEntity> deleteMer(@PathVariable("id") int id){
		
		mrepo.deleteById(id);
		return mrepo.findAll();
	}


}
