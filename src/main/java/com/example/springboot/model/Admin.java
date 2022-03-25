package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id_ad;
	@Column(name="name_ad")
	private String name_ad;

	@Column(name="phone_ad")
	private String phone_ad;

	@Column(name="email_ad")
	private String email_ad;

	@Column(name="address_ad")
	private String address_ad;

	@Column(name="pass_ad")
	private String pass_ad;

	@Column(name="role")
	private String role;

	public int getId() {
		return id_ad;
	}
	public void setId(int id_ad) {
		this.id_ad = id_ad;
	}
	public String getName_ad() {
		return name_ad;
	}
	public void setName_ad(String name_ad) {
		this.name_ad = name_ad;
	}
	public String getPhone_ad() {
		return phone_ad;
	}
	public void setPhone_ad(String phone_ad) {
		this.phone_ad = phone_ad;
	}
	public String getEmail_ad() {
		return email_ad;
	}
	public void setEmail_ad(String email_ad) {
		this.email_ad = email_ad;
	}
	public String getAddress_ad() {
		return address_ad;
	}
	public void setAddress_ad(String address_ad) {
		this.address_ad = address_ad;
	}
	public String getPass_ad() {
		return pass_ad;
	}
	public void setPass_ad(String pass_ad) {
		this.pass_ad = pass_ad;
	}
	public String getRole() {
		return role;
	}
	public void setRole_ad(String role) {
		this.role = role;
	}



}
