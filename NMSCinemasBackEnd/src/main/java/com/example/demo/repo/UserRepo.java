package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;


public interface UserRepo extends CrudRepository<User, String> 
{
     public User findByEmail(String email);
}
