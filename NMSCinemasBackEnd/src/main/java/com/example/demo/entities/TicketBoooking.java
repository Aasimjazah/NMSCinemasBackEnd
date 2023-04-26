package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TicketBoooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int screenId;
	
	private String movieName;

	private String date;

	private String time;

	private String language;

	private String price;

	private String tickets;

	private String userId;

	public TicketBoooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketBoooking(int id, int screenId, String movieName, String date, String time, String language, String price,
			String tickets, String userId) {
		super();
		this.id = id;
		this.screenId = screenId;
		this.movieName = movieName;
		this.date = date;
		this.time = time;
		this.language = language;
		this.price = price;
		this.tickets = tickets;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTickets() {
		return tickets;
	}

	public void setTickets(String tickets) {
		this.tickets = tickets;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TicketBoooking [id=" + id + ", screenId=" + screenId + ", movieName=" + movieName + ", date=" + date
				+ ", time=" + time + ", language=" + language + ", price=" + price + ", tickets=" + tickets
				+ ", userId=" + userId + "]";
	}
	 
}
