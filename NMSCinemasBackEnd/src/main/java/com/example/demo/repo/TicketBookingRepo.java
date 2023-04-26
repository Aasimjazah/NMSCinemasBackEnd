package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.TicketBoooking;

@Repository
public interface TicketBookingRepo extends CrudRepository<TicketBoooking, Integer> {

}
