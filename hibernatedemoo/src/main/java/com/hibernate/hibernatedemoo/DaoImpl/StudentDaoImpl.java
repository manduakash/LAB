package com.hibernate.hibernatedemoo.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hibernatedemoo.config.HibernateUtil;
import com.hibernate.hibernatedemoo.dao.StudentDao;
import com.hibernate.hibernatedemoo.entity.Student;

public class StudentDaoImpl implements StudentDao{

	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		String n,d,e;
		long p;
		System.out.println("Enter name: ");
		n = sc.nextLine();
		System.out.println("Enter Dept: ");
		d = sc.nextLine();
		System.out.println("Enter email: ");
		e = sc.nextLine();
		System.out.println("Enter phone: ");
		p = sc.nextLong();
		
		Student s = new Student();
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
	}

	public void updateStudent() {
		
	}

	public void deleteStudent() { 
				
	}

	public void fetchStudent() {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("Enter id: ");
		id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);
		System.out.println(s1.getId()+ " " + s1.getName()+ " "+ s1.getDept()+ " " + s1.getEmail()+ " " + s1.getPhone());
	}

}
