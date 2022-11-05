package com.jspider.Repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jspider.Entity.MoviePaymentEntity;
import com.jspider.sessionfactory.SingleFactoryClass;

public class MoviePaymentRepo {
	
	private static void totalPriceCali(MoviePaymentEntity e)
	{
		e.setTotalPrice(e.getPrice()*e.getNumOfTickets());
	}
	
	public void saveMoviePayment(MoviePaymentEntity e)
	{
		totalPriceCali(e);
		
		Session session =SingleFactoryClass.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(e);
		transaction.commit();
	}

}
