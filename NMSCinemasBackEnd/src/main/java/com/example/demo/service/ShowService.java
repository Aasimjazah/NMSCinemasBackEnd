package com.example.demo.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ShowException;
import com.example.demo.entities.ShowScreen;
import com.example.demo.repo.ShowRepo;

@Service
public class ShowService {

	@Autowired
	private ShowRepo showRepo;

	public ShowScreen addShow(ShowScreen show) {
		show.setStatus("enable");
		return showRepo.save(show);
	}

	public Map<String, String> getAllMovie() throws ShowException {
		Map<String, String> movieName = new HashMap<>();
		List<ShowScreen> shows = (List<ShowScreen>) showRepo.findAll();
		if (shows != null) {

			for (ShowScreen show : shows) {
				movieName.put(show.getMovieName(), show.getImgName());
			}
			return movieName;
		} else
			throw new ShowException("shows does not exist");

	}

	public List<ShowScreen> getShowByMovieName(String status, String movieName) throws ShowException {

		List<ShowScreen> movies = showRepo.getShowsByMovie(status, movieName);
		if (!movies.isEmpty()) {
			return movies;
		} else
			throw new ShowException("movie does not exist with this name");
	}

	public ShowScreen updateShowById(ShowScreen showScreen) {
		return showRepo.save(showScreen);
	}

	public Map<String, String> getByMovieName(String movieName) throws ShowException {

		List<ShowScreen> shows = showRepo.findByMovieName(movieName);
		Map<String, String> movies = new HashMap<String, String>();
		for (ShowScreen show : shows) {
			movies.put(show.getMovieName(), show.getImgName());
		}
		return movies;
	}

	public Map<String, String> getMovieByLanguage(String language)throws ShowException {
		List<ShowScreen> shows = showRepo.findByLanguage(language);
		Map<String, String> movies = new HashMap<String, String>();
		for (ShowScreen show : shows) {
			movies.put(show.getMovieName(), show.getImgName());
		}
		return movies;
	}

	public List<ShowScreen> getAllShows() throws ShowException {
		
		return (List<ShowScreen>) showRepo.findAll();
	}
	
	public ShowScreen changeShowStatus(int id)
	{
		ShowScreen show = showRepo.findById(id);
		show.setStatus("disabled");
		showRepo.save(show);
		return show;
		
	}
}
