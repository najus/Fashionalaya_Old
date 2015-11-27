package com.fashionalaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

}
