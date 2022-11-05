package com.jspider.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleFactoryClass {

	public static SessionFactory sessionFactory=null;
	
	private SingleFactoryClass() {}
	
	
		
	public static SessionFactory getSessionFactory() {
		
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	 
	 return sessionFactory;
	}
	
}
