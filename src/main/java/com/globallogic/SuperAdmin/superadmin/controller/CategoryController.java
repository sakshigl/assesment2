package com.globallogic.SuperAdmin.superadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.SuperAdmin.superadmin.entity.CategoryEntity;
import com.globallogic.SuperAdmin.superadmin.repo.CategoryRepo;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepo catRepo;
	
	@GetMapping("/")
	public List<CategoryEntity >getCat() {
		return catRepo.findAll();
	}
	
	@PostMapping("/")
	public List<CategoryEntity> saveDept(@RequestBody CategoryEntity catEntity){
		
		catRepo.save(catEntity);
		return catRepo.findAll();
	}

	@PutMapping("/")
    public List<CategoryEntity> updateDept(@RequestBody CategoryEntity catEntity){
		
		catRepo.save(catEntity);
		return catRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
    public List<CategoryEntity> deleteDept(@PathVariable("id") int id){
		
		catRepo.deleteById(id);
		return catRepo.findAll();
	}

}
