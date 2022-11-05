package com.jspider.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movieDetails")
public class MovieDetailsEntity implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="Id")
	private Long id;
	
	
	@Column(name="MovieId")
	private Long movieId;
	
	@Column(name="MovieName")
	private String movieName;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="budget")
	private Double budget;
	
	@Column(name="releaseDate")
	private String releaseDate;

	

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", movieId=" + movieId + ", movieName=" + movieName + ", rating="
				+ rating + ", budget=" + budget + ", releaseDate=" + releaseDate + "]";
	}

	
	 
	
	
}
