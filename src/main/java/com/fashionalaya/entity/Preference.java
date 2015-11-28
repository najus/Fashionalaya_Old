package com.fashionalaya.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name = "Preference")
public class Preference {

	@Id
	@Column
	private int id;

	@Column
	private String tag;

	@Column
	private int userPrefCount;

	@Column
	private int designPrefCount;
	
	@ManyToMany
//	@JoinColumn(name="user_pref_id")
	private List<User> user;

}
