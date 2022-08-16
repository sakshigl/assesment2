package com.globallogic.SuperAdmin.superadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.SuperAdmin.superadmin.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
