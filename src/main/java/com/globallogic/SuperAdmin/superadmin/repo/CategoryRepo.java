package com.globallogic.SuperAdmin.superadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.SuperAdmin.superadmin.entity.CategoryEntity;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer>{

}
