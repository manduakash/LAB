package com.example.entiy;
/*
@Author Sankhajit Roy
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	// taking entities
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	
	@Column(length = 30,nullable = false)
	private String stdName;

}
