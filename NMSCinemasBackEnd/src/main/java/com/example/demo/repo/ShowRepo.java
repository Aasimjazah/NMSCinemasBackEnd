package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ShowScreen;

@Repository
public interface ShowRepo extends CrudRepository<ShowScreen, Integer> {

	
	ShowScreen findById(int id);
	
	@Query(value="select * from show_screen p where p.movie_name like %:search%" , nativeQuery=true)
	List<ShowScreen> findByMovieName(@Param("search")String search);
    
	
	List<ShowScreen> findByLanguage(String language);

	
	@Query(value="select * from show_screen p where p.status='enable' like %:search%" , nativeQuery=true)
	List<ShowScreen> getShowsByMovie();

}
