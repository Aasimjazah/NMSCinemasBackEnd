package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.TicketBoooking;
import com.example.demo.repo.TicketBookingRepo;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingRepo bookingRepo;
	
	
	public TicketBoooking addTicket(TicketBoooking ticketBoooking)
	{
		return bookingRepo.save(ticketBoooking);
	}

	
	public List<TicketBoooking> getTicketsByEmail(String email)
	{
		return bookingRepo.findByUserId(email);
	}
}
