package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.AdminException;
import com.example.demo.entities.Admin;
import com.example.demo.service.AdminService;


@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addAdmin")
	public ResponseEntity<?> addAdmin(@RequestBody Admin admin) throws AdminException
	{
		return new ResponseEntity<>(adminService.addAdmin(admin),HttpStatus.CREATED);
	}
	
	@PostMapping("/checkAdmin")
	public ResponseEntity<?> getAdmin(@RequestBody Admin admin) throws AdminException
	{
		return new ResponseEntity<>(adminService.getAdmin(admin),HttpStatus.OK);
	}
}