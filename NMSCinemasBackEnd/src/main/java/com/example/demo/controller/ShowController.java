package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ShowScreen;
import com.example.demo.service.ShowService;

@CrossOrigin
@RestController
public class ShowController {
	
	@Autowired
	private ShowService showService;
	
  @PostMapping("/addShow")
  public ShowScreen addShow(@RequestBody ShowScreen show)
  {
	  return showService.addShow(show);
  }
  
  @GetMapping("/getAllMovie")
  public Set<String> getAllMovie()
  {
	  System.out.println(showService.getAllMovie());
	  return showService.getAllMovie();
  }
  
  @GetMapping("/getShowByMovieName/{movieName}")
  public List<ShowScreen> getShowByMovieName(@PathVariable("movieName") String movieName)
  {
	  return showService.getShowByMovieName(movieName);
  }
  
  @PostMapping("/updateShowById")
  public ShowScreen updateShowById(@RequestBody ShowScreen showScreen)
  {
	  return showService.updateShowById(showScreen);
  }
	
}
