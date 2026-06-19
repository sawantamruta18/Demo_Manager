package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerRepository;

@Service
public class MangerServiceImpl implements ManagerService {

	
	@Autowired
	private ManagerRepository sr;
	@Override
	public void add(Manager s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Manager> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
