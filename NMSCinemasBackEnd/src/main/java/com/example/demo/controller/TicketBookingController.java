package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.TicketBoooking;
import com.example.demo.service.TicketBookingService;

@RestController
@CrossOrigin
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService bookingService;
	
	
	@PostMapping("/addBooking")
	public TicketBoooking addBooking(@RequestBody TicketBoooking ticketBoooking)
	{
		return bookingService.addTicket(ticketBoooking);
	}

}
