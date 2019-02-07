package org.bookstore.controller;

import org.bookstore.po.Book;
import org.bookstore.po.Orderitem;
import org.bookstore.po.Orders;
import org.bookstore.po.Userinfo;
import org.bookstore.service.IBookService;
import org.bookstore.service.IOrderService;
import org.bookstore.tool.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Iterator;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 23:04
 */
@Controller
public class ShopController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/addToCart")
    public ModelAndView addToCart(HttpSession session, int bookid, int quantity) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //得到要购买的图书
        Book book=bookService.getBookById(bookid);
        //创建一个订单项
        Orderitem orderitem=new Orderitem();
        //把要购买的书籍添加到订单项
        orderitem.setBook(book);
        //设置要购买图书数量
        orderitem.setQuantity(quantity);

        //获得购物车对象
        Cart cart=(Cart)session.getAttribute("cart");
        //如果没有就创建一个
        if(cart==null){
            cart=new Cart();
        }
        //把图书的ID和订单项添加入购物车
        cart.addBook(bookid, orderitem);
        //把购物车放入Session中
        session.setAttribute("cart", cart);

        modelAndView.setViewName("addToCart_success");
        return modelAndView;
    }

    @RequestMapping("/updateCart")
    public ModelAndView updateCart(HttpSession session,int bookid,int quantity) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        Cart cart=(Cart)session.getAttribute("cart");
        //直接调用购物车模型中的方法实现修改图书数量
        cart.updateCart(bookid, quantity);
        session.setAttribute("cart", cart);

        modelAndView.setViewName("showCart");
        return modelAndView;
    }

    @RequestMapping("/checkout")
    public String checkout(HttpSession session,HttpServletRequest request) throws Exception{
        Userinfo user=(Userinfo)session.getAttribute("user");
        Cart cart=(Cart)session.getAttribute("cart");
        if(user==null || cart ==null)
            return "login.jsp";			//如果没有登录返回登录界面
        Orders order=new Orders();
        order.setOrderdate(new Date());
        order.setUser(user);
//		System.out.println(user.getId());
        for(Iterator it = cart.getItems().values().iterator(); it.hasNext();){
            Orderitem orderitem=(Orderitem)it.next();
            orderitem.setOrders(order);
            order.getOrderitems().add(orderitem);
        }
        orderService.saveOrder(order);
        request.setAttribute("order", order);
        return "checkout_success";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }
}
