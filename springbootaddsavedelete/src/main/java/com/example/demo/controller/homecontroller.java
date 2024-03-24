package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.homemodel;
import com.example.demo.service.BookService;

@Controller

public class homecontroller 
{
	@Autowired
	private BookService service;
	
	@GetMapping("/book_register")
	public String bookRegister()
	{
	   return "book";	
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBooks()
	{
	   List<homemodel>list=service.getAllBook();
	   return new ModelAndView("bookList","homemodel",list);
	}
	@PostMapping("/save")
	public String addBook(@ModelAttribute homemodel b)
	{
		service.save(b);
		return "redirect:/available_books";
	}
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id,Model model)
	{
		homemodel b=service.getBookById(id);
		model.addAttribute("book",b);
		return "bookedit";
		
	}
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int id)
	{
		service.deleteById(id);
		return "redirect:/available_books";
		
	}
	
     
     
}
