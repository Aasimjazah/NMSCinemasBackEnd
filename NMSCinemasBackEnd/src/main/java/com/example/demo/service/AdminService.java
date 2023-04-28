package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.AdminException;
import com.example.demo.entities.Admin;
import com.example.demo.repo.AdminRepo;


@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin addAdmin(Admin admin) throws AdminException
	{
		Admin addAdmin= adminRepo.save(admin);
		
		if(addAdmin!=null)
		 return addAdmin;
		else
			throw new AdminException("provided wrong data to create admin");
	}
	
	public Admin getAdmin(Admin admin) throws AdminException
	{
		Admin adminCred= adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
		if(adminCred!=null)
			return adminCred;
		else
			throw new AdminException("admin does not exist with this cred");
	}

}
