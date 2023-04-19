package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.repo.AdminRepo;


@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin addAdmin(Admin admin)
	{
		return adminRepo.save(admin);
	}
	
	public Admin getAdmin(Admin admin)
	{
		return adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}

	public Admin findByUsername(String email) {
		
		 Admin admin=adminRepo.findByEmail(email);
		 return adminRepo.save(admin);
	}
}
