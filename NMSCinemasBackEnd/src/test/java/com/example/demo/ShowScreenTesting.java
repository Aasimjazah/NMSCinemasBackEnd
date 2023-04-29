package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.ShowController;
import com.example.demo.entities.ShowScreen;

@SpringBootTest
class ShowScreenTesting {

	
	@Autowired
	ShowController showScreenController;
	
	//Test case for changeShowStatusById API
	
	@Test
	void changeShowStatusById() 
	{
		ShowScreen show = new ShowScreen();
		String status = "disabled";
		show = showScreenController.changeShowStatus(2,status);
		
		assertEquals(show.getStatus(), status);
	}

}
