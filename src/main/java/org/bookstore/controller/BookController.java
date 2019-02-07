package org.bookstore.controller;

import org.bookstore.po.Book;
import org.bookstore.po.Catalog;
import org.bookstore.service.IBookService;
import org.bookstore.service.ICatalogService;
import org.bookstore.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 22:57
 */
@Controller
public class BookController {
    @Autowired
    private ICatalogService catalogService;
    @Autowired
    private IBookService bookService;

    @RequestMapping("/browseCatalog")
    public ModelAndView browseCatalog() {

        ModelAndView modelAndView = new ModelAndView();

        List<Catalog> list = catalogService.findAllCatalogname();//得到所有图书分类名
        modelAndView.addObject("catalogname", list);
        modelAndView.setViewName("menu");
        return modelAndView;
    }

    @RequestMapping("/newBook")
    public ModelAndView newBook() {
        ModelAndView modelAndView = new ModelAndView();

        List<Book> books = bookService.getNewBook();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("newBook_success");
        return modelAndView;
    }

    @RequestMapping("/searchBook")
    public ModelAndView searchBook(String bookname) {
        ModelAndView modelAndView = new ModelAndView();

        List<Book> books = bookService.getBookByName(bookname);
        modelAndView.addObject("bookItems", books);
        modelAndView.setViewName("searchBook_result");
        return modelAndView;
    }

    @RequestMapping("/browseBookPaging")
    public ModelAndView browseBookPaging(Integer catalogid,Integer currentPage) {
        ModelAndView modelAndView = new ModelAndView();

        int totalSize = bookService.getTotalByCatalog(catalogid);
        Pager pager=new Pager(currentPage,totalSize);
        Integer start = (currentPage - 1) * pager.getPageSize();
        Integer maxnumber = 3;

        List<Book> books = bookService.getBookByCatalogId(catalogid, start, maxnumber);
        modelAndView.addObject("bookItems", books);
        modelAndView.addObject("pager", pager);
        modelAndView.addObject("catalogid", catalogid);
        modelAndView.setViewName("browseBookPaging");
        return modelAndView;
    }
}
