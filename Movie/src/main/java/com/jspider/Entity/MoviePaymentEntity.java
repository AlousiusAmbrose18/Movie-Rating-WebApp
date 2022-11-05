package com.jspider.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="moviePayment")
public class MoviePaymentEntity implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private Long id;
	
	
	@Column(name="MovieId")
	private Long MovieId;
	
	@Column(name="NumOfTickets")
	private Integer numOfTickets;
	
	@Column(name="Price")
	private Double price;
	
	@Column(name="ShowDate")
	private String showDate;
	
	@Column(name="ShowTime")
	private String showTime;
	
	@Column(name="PaymentType")
	private String paymentType;
	
	@Column(name="TotalPrice")
	private Double totalPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMovieId() {
		return MovieId;
	}

	public void setMovieId(Long movieId) {
		MovieId = movieId;
	}

	public Integer getNumOfTickets() {
		return numOfTickets;
	}

	public void setNumOfTickets(Integer numOfTickets) {
		this.numOfTickets = numOfTickets;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "MoviePaymentEntity [id=" + id + ", MovieId=" + MovieId + ", numOfTickets=" + numOfTickets + ", price="
				+ price + ", showDate=" + showDate + ", showTime=" + showTime + ", paymentType=" + paymentType
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
}
