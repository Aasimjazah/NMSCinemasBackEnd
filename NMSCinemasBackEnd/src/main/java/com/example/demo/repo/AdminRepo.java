package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;



@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>{
  
	Admin findById(int id);
	Admin findByEmailAndPassword(String email, String password);
	Admin findByEmail(String email);
}