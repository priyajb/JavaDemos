package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}

	@Autowired
	IBookService bookservice;
	@Override
	public void run(String... args) throws Exception {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter choice");
	        int choice = sc.nextInt();

	        IBookService bookService = new BookServiceImpl();
	        List<Book> booksByCategory;
	        List<Book> booksByAuthor;
	        List<Book> booksByPrice;
	        List<Book> booksBybookId;
	
		
		
		 try {
	            switch (choice) {
	                case 1:  System.out.println("Enter category");
	                         String category = sc.next();
	                         booksByCategory = bookService.getCategory(category);
	                         for (Book book : booksByCategory) {
	                            System.out.println(book);
	                        }
	                         break;
	                case 2: System.out.println("Enter Author");
	                        String author = sc.next();
	                        booksByAuthor = bookService.getByAuthorStartWith(author);
	                        System.out.println(booksByAuthor);
	                        break;

	                case 3: System.out.println("Enter price");
	                        double price = sc.nextDouble();
	                        booksByPrice = bookService.getByPriceLessThan(price);
	                        System.out.println(booksByPrice);
	                        break;

	                case 4:
	                    System.out.println("Enter bookId");
	                    int bookId = sc.nextInt();
	                    booksBybookId =  bookService.getById(bookId);
	                    System.out.println(booksBybookId);
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
