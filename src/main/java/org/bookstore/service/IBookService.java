package org.bookstore.service;

import org.bookstore.po.Book;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:54
 */
public interface IBookService {
    public int getTotalByCatalog(Integer catalogid);

    public List<Book> getNewBook();

    public List<Book> getBookByName(String name);

    public List<Book> getBookByCatalogId(int catalogid,int start,int maxnumber);

    public Book getBookById(Integer bookid);
}
