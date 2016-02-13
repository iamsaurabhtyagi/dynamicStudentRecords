package com.hibernate.dao.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewSession {

	private static SessionFactory factory=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("Configured: "+cfg);
		factory=cfg.buildSessionFactory();
		System.out.println("Hibernate's SessionFactory Created");
	}
	
	public static Session getSession() {
		System.out.println("New Session Created");
		return factory.openSession();
	}

}
