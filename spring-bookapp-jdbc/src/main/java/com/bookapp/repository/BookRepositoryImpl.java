package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements IBookRepository {

	private JdbcTemplate jdbcTemplate;

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		Object[] bookArray = { book.getTitle(), book.getAuthor(), book.getPrice(), book.getCategory() };
		jdbcTemplate.update(Queries.INSERTQUERY, bookArray);
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY, price, bookId);

	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);

	}

	@Override
	public List<Book> finalAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

//	@Override
//	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
//		RowMapper<Book> mapper = new BookMapper();
//		return jdbcTemplate.query(Queries.SELECTBYAUTHORCATQUERY, mapper, author);
//
//	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTBYCATEGORYQUERY, mapper, category);
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, mapper, price);

	}

	@Override
	public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		//return jdbcTemplate.query(Queries.SELECTBYAUTHORCATQUERY, mapper, author, category);
		return null;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		return jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY, new BookMapper(), bookId);
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {

		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, new BookMapper(), author);
	}

}
