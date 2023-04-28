package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ShowException;
import com.example.demo.entities.ShowScreen;
import com.example.demo.repo.ShowRepo;
import com.example.demo.service.ShowService;

@CrossOrigin
@RestController
public class ShowController {

	@Autowired
	private ShowService showService;
	
	@Autowired
	private ShowRepo showRepo;

	@PostMapping("/addShow")
	public ShowScreen addShow(@RequestBody ShowScreen show) {
		return showService.addShow(show);
	}

	@GetMapping("/getAllMovie")
	public ResponseEntity<?> getAllMovie() throws ShowException {
		System.out.println(showService.getAllMovie());
		return new ResponseEntity<>(showService.getAllMovie(), HttpStatus.OK);
	}

	@GetMapping("/getShowByMovieName/{movieName}")
	public ResponseEntity<?> getShowByMovieName(@PathVariable("movieName") String movieName) throws ShowException {
		try {
			List<ShowScreen> shows = showService.getShowByMovieName(movieName);
			return new ResponseEntity<>(shows, HttpStatus.OK);
		} 
		catch (ShowException e) 
		{
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/updateShowById")
	public ResponseEntity<?> updateShowById(@RequestBody ShowScreen showScreen) {
		return new ResponseEntity<>(showService.updateShowById(showScreen), HttpStatus.ACCEPTED);
	}

	@PutMapping("/uploadImage/{movieName}")
	public void uploadImage(@PathVariable("movieName") String movieName,@RequestBody String url)
	{
		System.out.println("calling uplaodImage api.....");
		System.out.println(movieName);
		System.out.println(url);
		
		List<ShowScreen> shows=showRepo.findByMovieName(movieName);
		for(ShowScreen show: shows)
		{
			show.setImgName(url);
		}
		showRepo.saveAll(shows);
//		product.setImgname(url);
//		productRepo.save(product);
	}
}
