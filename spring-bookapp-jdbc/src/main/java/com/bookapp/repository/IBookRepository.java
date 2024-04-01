package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookRepository {
    void addBook(Book book);
    void updateBook(int bookId,double price);
    void deleteBook(int bookId);

    List<Book> finalAll();
    List<Book> findByAuthor(String author) throws BookNotFoundException;
    //List<Book> findByAuthorContains(String author)throws BookNotFoundException;
    
    List<Book> findByCategory(String category)throws BookNotFoundException;
    List<Book> findByPriceLessThan(double price)throws BookNotFoundException;
    List<Book> findByAuthorCategory(String author,String categoty)throws BookNotFoundException;
    Book findById(int bookId) throws BookNotFoundException;

}
