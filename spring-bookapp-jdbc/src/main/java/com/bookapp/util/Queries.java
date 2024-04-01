package com.bookapp.util;

public class Queries {

    public static final String INSERTQUERY="insert into book(title,author,price,category)";
    public static final String UPDATEQUERY="update book price=? where book_id=?";
    public static final String DELETEQUERY="delete from book where book_Id";
    
    public static final String SELECTQUERY = "Select * from book";
    public static final String SELECTBYAUTHORQUERY = "Select * from book where author=?";
    public static final String SELECTBYCATEGORYQUERY = "Select * from book where category=?";

    public static final String SELECTBYPRICEQUERY = "Select * from book where price<?";
   // public static final String SELECTBYAUTHORCATQUERY = "Select * from book where author=? and category=?";
    public static final String SELECTBYIDQUERY = "Select * from book where bookId=?";

}
