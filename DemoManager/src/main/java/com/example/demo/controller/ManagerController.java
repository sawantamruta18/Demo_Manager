package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService ss;
	
	@GetMapping("/display")
	public List<Manager>displayManager(){
		return ss.display();
	}
	
	@PostMapping("/add")
	public void addManger(Manager s) {
		ss.add(s);
	}
	
	
}
