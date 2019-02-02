package org.bookstore.service;

import org.bookstore.po.Orders;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:57
 */
public interface IOrderService {
    public void saveOrder(Orders order);
}
