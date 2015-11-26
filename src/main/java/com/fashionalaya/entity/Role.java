package com.fashionalaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Role")
public class Role {

	@Id
	@Column
	private int id;

	@Column
	private String roleName;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;

}
