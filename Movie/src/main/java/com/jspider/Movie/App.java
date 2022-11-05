package com.jspider.Movie;

import com.jspider.Entity.MovieDetailsEntity;
import com.jspider.Entity.MoviePaymentEntity;
import com.jspider.Repository.MovieDetailsRepo;
import com.jspider.Repository.MoviePaymentRepo;

public class App 
{
    public static void main( String[] args )
    {
    	MovieDetailsEntity movieDetails = new MovieDetailsEntity();
    	MoviePaymentEntity moviePayment = new MoviePaymentEntity();
    	
    	MovieDetailsRepo detailsRepo = new MovieDetailsRepo();
    	MoviePaymentRepo paymentRepo = new MoviePaymentRepo();
    	
    	movieDetails.setMovieName("Valimai");
    	movieDetails.setMovieId(555L);
    	movieDetails.setRating("7.5");
    	movieDetails.setReleaseDate("05/01/2020");
    	movieDetails.setBudget(400D);
    	
    	detailsRepo.saveMovieDetails(movieDetails);
    	
    	
    	moviePayment.setMovieId(444L);
    	moviePayment.setNumOfTickets(2);
    	moviePayment.setPaymentType("Card");
    	moviePayment.setPrice(150D);
    	moviePayment.setShowDate("05/08/2022");
    	moviePayment.setShowTime("Morning");
    	
    	
    	paymentRepo.saveMoviePayment(moviePayment);
    	
    }
    
    
    
    
    
}
