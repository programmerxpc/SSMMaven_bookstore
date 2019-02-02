package org.bookstore.mapper;

import org.apache.ibatis.annotations.Param;
import org.bookstore.po.Book;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:33
 */
public interface BookMapper {
    /**
     * 根据分类id查询书的总数
     * @param catalogid 分类id
     * @return
     */
    public int getTotalByCatalog(int catalogid);

    /**
     * 获取所有图书
     * @return
     */
    public List<Book> getNewBook();

    /**
     * 根据书名获得图书
     * @param bookname 书名
     * @return
     */
    public List<Book> getBookByName(String bookname);

    /**
     * 根据分类id查询图书
     * @param catalogid 分类id
     * @return
     */
    public List<Book> selectBookByCatalogId(@Param("catalogid")Integer catalogid, @Param("start")Integer start, @Param("maxnumber")Integer maxnumber);

    /**
     * 根据图书id查询图书
     * @param bookid 图书id
     * @return
     */
    public Book getBookById(int bookid);
}
