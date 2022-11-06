package com.book.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.book.model.Favorite;
import com.book.model.User;
import com.book.repository.BookRepository;
import com.book.repository.FavoriteRepository;
import com.book.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BookService {
	public Long cid;
	@Autowired
	private BookRepository bkRepo;
	
	@Autowired
	private FavoriteRepository favRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public String addUser(User user) {
		
		User us=new ObjectMapper().convertValue(user,User.class);
		cid=userRepo.save(us).getNo();
		System.out.println(cid+" Saved sucessfully");
		return null;	
	}

	public String authenicate(String name, String password) {
		// TODO Auto-generated method stub
		List<User> users=userRepo.findAll();
		int n=users.size();
		System.out.println(users);
		for(int i=0;i<n;i++) {
			User cu=users.get(i);
			if(cu.getName().equals(name)) {
				System.out.println("got user");
				
				if(cu.getPass().equals(password)) {
					cid=cu.getNo();
					System.out.println("got pass");
					return "no";
				}else {
					return "Incorrect Password";
				}
			}
		}
		return "User not Found";
	}

	public void addFav(Long id, Long cid2) {
		// TODO Auto-generated method stub
		
	    Favorite fav=new Favorite(cid2,id);
		favRepo.save(fav);
		 System.out.println("fav saved...........");
	}
	public void addFav(Long id) {
		// TODO Auto-generated method stub
		
	    Favorite fav=new Favorite(cid,id);
		favRepo.save(fav);
		 System.out.println("fav saved...........");
	}
	
	public List<Book> favBook(Long id){
		System.out.print("at favbook1.........");
		List<Favorite> fav=favRepo.findAll();
		List bk=bkRepo.findAll();
		System.out.println("at favbook findALL.........");
		System.out.println(bk);
		List<Book> favBk=new ArrayList<Book>();
		int n=fav.size();
		for(int i=0;i<n;i++) {
			Favorite cf=fav.get(i);
			if(cf.getUserNo()==cid) {
			    Long bik=cf.getBookId();
			    System.out.println("............."+bik);
				int l=bk.size();
				for(int j=0;j<l;j++) {
					Book book=(Book)bk.get(j);
					if(book.getId().equals(bik)) {
						System.out.println(book);
						favBk.add(book);
						System.out.print("at favbook.........");
					}	
				}
				
			    System.out.println(favBk);
			    
			}
		}
		return  favBk;	
	}


	public List<Book> sort(String s) {
		// TODO Auto-generated method stub
		
		String str=s.toUpperCase();
		List<Book> sorted=new ArrayList();
		List bk=bkRepo.findAll();
		int n=bk.size();
		for(int i=0;i<n;i++) {
			Book book=(Book) bk.get(i);
			if(book.getAuthorname().toUpperCase().equals(str)) {
				sorted.add(book);
			}
			else if(book.getName().toUpperCase().equals(str)) {
				sorted.add(book);
			}
			else if(book.getGenera().toUpperCase().equals(str)) {
				sorted.add(book);
			}
		}
		System.out.println(sorted);
		
		return sorted;
	}	
}

//	Long adNumber=adRepo.save(ad).getId();
//	
//	System.out.println("Saved Sucessfully");
//	
//	Students st=new Students(100L,adNumber);
//	
//	Long stNumber=stRepo.save(st).getRegnum();
//	
//	return "Admission is confirmed.. "+stNumber;