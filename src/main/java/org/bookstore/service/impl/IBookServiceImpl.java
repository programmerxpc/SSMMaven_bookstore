package org.bookstore.service.impl;

import org.bookstore.mapper.BookMapper;
import org.bookstore.po.Book;
import org.bookstore.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 20:03
 */
@Service
public class IBookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int getTotalByCatalog(Integer catalogid) {
        return bookMapper.getTotalByCatalog(catalogid);
    }

    @Override
    public List<Book> getNewBook() {
        return bookMapper.getNewBook();
    }

    @Override
    public List<Book> getBookByName(String name) {
        return bookMapper.getBookByName(name);
    }

    @Override
    public List<Book> getBookByCatalogId(int catalogid, int start, int maxnumber) {
        return bookMapper.selectBookByCatalogId(catalogid, start, maxnumber);
    }

    @Override
    public Book getBookById(Integer bookid) {
        return bookMapper.getBookById(bookid);
    }
}
