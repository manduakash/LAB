package com.example.daoimpl;
/*
@Author Sankhajit Roy
*/

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.StudentDAO;
import com.example.entiy.Student;

public class StudentDaoImpl implements StudentDAO {

	@Override
	public void addStudent() {

		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		String n, d, e;
		long p;
		// taking user input & read the user input
		System.out.println("Enter Name: ");
		n = sc.nextLine();
		// creating a student class object
		Student s = new Student();
		// set values
		s.setStdName(n);
		// mapping with entity classes
		Session session = HibernateUtil.getSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();

	}

}
