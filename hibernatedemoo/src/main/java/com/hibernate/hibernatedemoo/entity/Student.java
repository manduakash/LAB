package com.hibernate.hibernatedemoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 20, nullable = false)
	private String name;
	@Column(length = 11, nullable = false, unique = true)
	private long phone;
	@Column(length = 20, nullable = false)
	private String dept;
	@Column(length = 20, nullable = false, unique = true)
	private String email;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	public String getDept() {
		return dept;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
