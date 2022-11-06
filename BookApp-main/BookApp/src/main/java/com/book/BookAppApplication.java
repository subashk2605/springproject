package com.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.book.model.Book;
import com.book.model.Favorite;
import com.book.model.User;
import com.book.repository.BookRepository;
import com.book.repository.FavoriteRepository;
import com.book.repository.UserRepository;


@SpringBootApplication
public class BookAppApplication {
	
	@Autowired
	private BookRepository repo;
	
	@Autowired
    private UserRepository userrepo;
	
	@Autowired
	private FavoriteRepository favrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}

	

	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Book("The jungle book","fiction","Rudyard Kipling"));
			repo.save(new Book("Thirukural","moral","Thiruvalluvar"));
			repo.save(new Book("Selapathuikaram","moral","Illangovadigal"));
			repo.save(new Book("Adventures of Sherlock Holmes","adventure","Sir Arthur Conan Doyle"));		
			repo.save(new Book("Bunch of Old Letters, A","story","Jawaharlal Nehru"));
			repo.save(new Book("Broken Wing","autobio","Sarojini Naidu"));
			repo.save(new Book("Brave New World","story","Aldous Huxley"));
			repo.save(new Book("Bitter Sweet","moral","Noel Coward"));
			repo.save(new Book("Bharat Bharati","history","Maithili Sharan Gupt"));
			repo.save(new Book("Between the Lines","poem","Kuldip Nayar"));
			repo.save(new Book("Babur-nama","autobio","Babur"));
			repo.save(new Book("Descent of Man","science","Charles Darwin"));
			repo.save(new Book("Charles Dickens","science","Charles Dickens"));
			repo.save(new Book("Das Capital","economy","Karl Marx"));
			repo.save(new Book("Crime and Punishment","history","Fyodor Dostoevsky"));
			repo.save(new Book("Coolie","biography","Mulk Raj Anand"));
			repo.save(new Book("Comedy of Errors","poem","William Shakespeare"));
			repo.save(new Book("Chitra","story","Rabindranath Tagore"));
			repo.save(new Book("Canterbury Tales","story","Geoffrey Chaucer"));
			repo.save(new Book("Caesar and Cleopatra","history","George Bernard Shaw"));
			repo.save(new Book("Ivanhoe","story","Walter Scott"));
			repo.save(new Book("Iron in the Soul","story","Jean-Paul Sartre"));
			repo.save(new Book("Invisible man","story","H. G. Wells"));
			repo.save(new Book("Indian Philosophy","history","Dr. S. Radhakrishnan"));
			repo.save(new Book("Indian Home Rule","history","M. K. Gandhi"));
			repo.save(new Book("India Wins Freedom","history","Maulana Abul Kalama Azad"));
			repo.save(new Book("Importance of Being Earnest","moral","Oscar Wilde"));
			repo.save(new Book("Childs play","story","Rudyard Kipling"));
			repo.save(new Book("Sevakasenthamani","poem","unknown"));
			repo.save(new Book("Kundalakasi","story","unknown"));
		};
	}
	
//	@Bean
//	public CommandLineRunner initDB1() {
//		return (args) -> {
//			favrepo.save(new Favorite("1L","2L"));
//		};
//	}
	
	@Bean
	public CommandLineRunner initDB2() {
		return (args) -> {
			userrepo.save(new User("Sri","1234","mail@gmail","111"));
			userrepo.save(new User("Bose","4321","mail@gamil","222"));
			userrepo.save(new User("prasanth","0987","mail@gamil","333"));
		};
	}

	
	
}
