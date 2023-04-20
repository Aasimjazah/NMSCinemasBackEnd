package com.example.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	public Set<String> getAllMovie()
	{
		Set<String> movieName = new HashSet<>();
		List<ShowScreen> shows = (List<ShowScreen>) showRepo.findAll();
		
		for(ShowScreen showss:shows)
		{
			movieName.add(showss.getMovieName());
		}
		
		return movieName;
	}

	public List<ShowScreen> getShowByMovieName(String movieName) {
		
		return showRepo.findByMovieName(movieName);
	}
}
