package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ShowScreen;
import com.example.demo.repo.ShowRepo;

@Service
public class ShowService  {

	
	@Autowired
	private ShowRepo showRepo;
	
	public ShowScreen addShow(ShowScreen show)
	{
		return showRepo.save(show);
	}
}
