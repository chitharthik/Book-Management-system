package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.homedao;
import com.example.demo.model.homemodel;
@Service

public class BookService {
	@Autowired
    private homedao bRepo;
	public void save(homemodel b) 
	{
		// TODO Auto-generated method stub
		bRepo.save(b);
	}
	public List<homemodel> getAllBook() 
	{
		// TODO Auto-generated method stub
		return bRepo.findAll();
	}
	public homemodel getBookById(int id) {
		// TODO Auto-generated method stub
		return bRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bRepo.deleteById(id);
	}

	

}
