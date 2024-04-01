package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookRepository bookRepository;

	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);

	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepository.updateBook(bookId, price);

	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
	}

	@Override
	public List<Book> finalAll() {
		List<Book> books = bookRepository.finalAll();
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		List<Book> books = bookRepository.findByAuthor(author);
		if (books.isEmpty())
			throw new BookNotFoundException("book not available");
		return books;
	}

//	@Override
//	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
//		List<Book> books = bookRepository.findByAuthorContains(author);
//		if (books.isEmpty())
//			throw new BookNotFoundException("book not available");
//		else
//			return books;
//	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> books = bookRepository.findByCategory(category);
		if (books.isEmpty())
			throw new BookNotFoundException("book not available");
		else
			return books;
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = bookRepository.findByPriceLessThan(price);
		if (books.isEmpty())
			throw new BookNotFoundException("book not available");
		else
			return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String categoty) throws BookNotFoundException {
		List<Book> books = bookRepository.findByAuthorCategory(author, categoty);
		if (books.isEmpty())
			throw new BookNotFoundException("book not available");
		else
			return books;
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book = bookRepository.findById(bookId);
		if (book == null) {
			throw new IdNotFoundException();
		} else
			return book;
	}
}