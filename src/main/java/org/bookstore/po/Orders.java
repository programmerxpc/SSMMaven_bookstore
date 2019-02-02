package org.bookstore.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:20
 */
public class Orders {
    private Integer orderid;

    private Date orderdate;
    private Userinfo user;//订单输入用户
    private Set orderitems = new HashSet();

//    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }

    public Set getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(Set orderitems) {
        this.orderitems = orderitems;
    }

//    public Integer getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }
}
