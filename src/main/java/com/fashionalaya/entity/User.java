package com.fashionalaya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author najus
 *
 *
 */
@Entity(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotEmpty
	@Column
	private String firstName;

	@NotEmpty
	@Column
	private String lastName;

	@NotEmpty
	@Column
	private String address1;

	@Column
	private String address2;

	@Column
	private String phone;

	@Email
	@NotNull
	@Column
	private String email;

	@NotNull
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dob;

	@NotNull
	@Column
	private char gender;

	@Transient
	private MultipartFile profilePic;

	@OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
	private Role role;
}
