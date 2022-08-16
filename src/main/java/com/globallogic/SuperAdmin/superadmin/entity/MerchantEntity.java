package com.globallogic.SuperAdmin.superadmin.entity;

import javax.persistence.*;

@Entity
@Table(name="merchant")
public class MerchantEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id ;
	
	@Column
	String name;
	
	@Column
	String pincode;
	
	@Column
	String location;
	
	@Column
	int gstNo;

}
