package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Show;
import com.example.demo.service.ShowService;

@CrossOrigin
@RestController
public class ShowController {
	
	@Autowired
	private ShowService showService;
	
  @PostMapping("/addShow")
  public Show addShow(@RequestBody Show show)
  {
	  return showService.addShow(show);
  }
	
}
