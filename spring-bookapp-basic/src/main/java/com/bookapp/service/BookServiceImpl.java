package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;

import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements IBookService {
	private BookDetails details;
	
	
	
    @Autowired
	public void setDetails(BookDetails details) {
		this.details = details;
	}

	@Override
    public List<Book> getAll() {
        List<Book> books = details.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().startsWith(author)) {
                bookByAuthor.add(book);

            }
            if (bookByAuthor.isEmpty()) {
                throw new BookNotFoundException("book by this author not found");
            }

        }
        return bookByAuthor;
    }


    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().startsWith(category))
                booksByCategory.add(book);
        }
        if (booksByCategory.isEmpty())
            throw new BookNotFoundException("book by this author not found");


        return booksByCategory;
    }


    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> booksByPrice = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() < price)
                booksByPrice.add(book);
            }

        if (booksByPrice.equals(books)) {
            throw new BookNotFoundException();
        }
        return booksByPrice;
    }


    @Override
    public List<Book> getByAuthorsContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> books4 = new ArrayList<>();
        for (Book book : books) {
            if (!book.getAuthor().equals(author) && book.getCategory().equals(category)) {
                books4.add(book);
            }
        }
        if (books4.equals(books)) {
            throw new BookNotFoundException("book is not available");
        }
        return books4;
    }


    @Override
    public List<Book> getById(int bookId) throws IdNotFoundException {
        List<Book> books = details.showBooks();
     //   List<Book> books5 = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookId() == bookId) {
               return  books;
            }
        }
        if (books.equals(books)) {
            throw new IdNotFoundException("id is not available");
        }
        return null;
    }

	@Override
	public List<Book> getByAuthorStartWith(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
}


