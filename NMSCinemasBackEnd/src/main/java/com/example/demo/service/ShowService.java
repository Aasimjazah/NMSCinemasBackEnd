package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Show;
import com.example.demo.repo.ShowRepo;

@Service
public class ShowService  {

	
	@Autowired
	private ShowRepo showRepo;
	
	public Show addShow(Show show)
	{
		return showRepo.save(show);
	}
}
