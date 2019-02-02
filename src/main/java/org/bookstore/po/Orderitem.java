package org.bookstore.po;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:19
 */
public class Orderitem {
    private Integer orderitemid;

    private Integer quantity;

    private Orders orders;			//该订单项属于哪个订单
    private Book book;				//该订单项所对应的书籍

//    private Integer orderid;

//    private Integer bookid;

    public Orderitem() {}

    public Orderitem(Integer quantity,Orders orders,Book book) {
        this.quantity = quantity;
        this.orders = orders;
        this.book = book;
    }

    public Integer getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(Integer orderitemid) {
        this.orderitemid = orderitemid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

//    public Integer getOrderid() {
//        return orderid;
//    }
//
//    public void setOrderid(Integer orderid) {
//        this.orderid = orderid;
//    }
//
//    public Integer getBookid() {
//        return bookid;
//    }
//
//    public void setBookid(Integer bookid) {
//        this.bookid = bookid;
//    }
}
