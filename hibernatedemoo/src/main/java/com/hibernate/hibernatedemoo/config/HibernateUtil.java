package com.hibernate.hibernatedemoo.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory= new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
