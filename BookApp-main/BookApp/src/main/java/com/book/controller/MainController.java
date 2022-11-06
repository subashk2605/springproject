package com.book.controller;

import java.awt.print.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.book.model.*;
import com.book.repository.BookRepository;
import com.book.service.BookService;

@EnableAspectJAutoProxy
@RestController
public class MainController {
	
	private Long cid;
	
    @Autowired
	private BookService bs;
    
    @Autowired
    private BookRepository bkRepo;
    
	
	@RequestMapping("/test")
	public String Test() {
		return "Working...";
		
	}
	
	@GetMapping("/BookApp")
	public ModelAndView Main() {
		List books=bkRepo.findAll();
		System.out.println(books);
		HashMap<String,List<Book>> model=new HashMap<>();
		System.out.println(model);
		model.put("list", books);
		return new ModelAndView("main",model);
		
	}
	
	
	
	@RequestMapping("/login")
	public ModelAndView login(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return new ModelAndView("login");	
	}
	
	@PostMapping("/adduser")
	public ModelAndView aduser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.println(user);
		bs.addUser(user);
		cid=bs.cid;
		return new ModelAndView("main");
	}

	@RequestMapping("/check")
	public ModelAndView signin(ModelMap model,@RequestParam("user") String name,@RequestParam("pass") String password) {
		System.out.println(name+password);
		String err=bs.authenicate(name,password);
		if(err=="no") {
			 cid = bs.cid;
			return new ModelAndView("main");
		}
		model.put("errorMsg",err);
		return new ModelAndView("signin");
		
	}
	@RequestMapping("/index")
	public ModelAndView Index() {
		return new ModelAndView("signin");
		
	}
	
	@RequestMapping("/fav/{id}")
	public ModelAndView addFav(@PathVariable Long id) {
		System.out.println(id+"************************");
		bs.addFav(id);
		return new ModelAndView("fav");
	}
	
	@GetMapping("/fav")
	public ModelAndView favMain() {
		System.out.println("At control favMAin");
		List books=bs.favBook(cid);
		System.out.println("At control favMAin returned from favbook method");
		System.out.println(books);
		HashMap<String,List<Book>> model=new HashMap<>();
		System.out.println(model);
		model.put("list", books);
		return new ModelAndView("fav1",model);
		
	}
	
	@RequestMapping("/sort")
	public ModelAndView signin(@RequestParam("search") String s) {
		System.out.println(s);
		List sorted=bs.sort(s);
		System.out.println("at sortcontrol.."+sorted);
		HashMap<String,List<Book>> model=new HashMap<>();
		model.put("list",sorted);
		System.out.println(model);
		return new ModelAndView("SortedMain",model);
		
	}
	
}
