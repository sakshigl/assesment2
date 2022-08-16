package com.globallogic.SuperAdmin.superadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.SuperAdmin.superadmin.entity.CustomerEntity;

public interface CustomerRepo  extends JpaRepository<CustomerEntity, Integer>{

}
