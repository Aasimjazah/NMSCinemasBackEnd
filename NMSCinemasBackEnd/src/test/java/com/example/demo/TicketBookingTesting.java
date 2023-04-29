package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.TicketBookingController;
import com.example.demo.entities.TicketBoooking;
import com.example.demo.service.TicketBookingService;

@SpringBootTest
class TicketBookingTesting {

	@Autowired
	TicketBookingService bookingService;
	
	@Autowired
	TicketBookingController bookingController;
	
	   @Test
	    public void addBookingTesting() {
	        String email = "asimjazah8@gmail.com";
	        TicketBoooking booking1 = new TicketBoooking();
	        booking1.setScreenId(2);
	        booking1.setMovieName("End game");
	        booking1.setDate("1/5/2023");
	        booking1.setTime("4:30");
	        booking1.setPrice("200");
	        booking1.setTickets("b1,b2,b3");
	        booking1.setUserId(email);

	        TicketBoooking tb  = bookingController.addBooking(booking1);

	       // assertEquals(2, result.size());
	        assertEquals(booking1.getScreenId(), tb.getScreenId());
	        assertEquals(booking1.getMovieName(), tb.getMovieName());
	        assertEquals(booking1.getDate(), tb.getDate());
	        assertEquals(booking1.getTime(), tb.getTime());
	        assertEquals(booking1.getPrice(), tb.getPrice());
	        assertEquals(booking1.getTickets(), tb.getTickets());
	        assertEquals(booking1.getUserId(), tb.getUserId());

	        
	       
	    }

}
