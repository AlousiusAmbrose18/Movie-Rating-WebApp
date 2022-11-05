package com.jspider.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jspider.Entity.MovieDetailsEntity;
import com.jspider.sessionfactory.SingleFactoryClass;

public class MovieDetailsRepo {
	
	public void saveMovieDetails(MovieDetailsEntity m)
	{
		
		
		
		Session session = SingleFactoryClass.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(m);
		transaction.commit();
	}

}
