package org.bookstore.service.impl;

import org.bookstore.mapper.OrdersMapper;
import org.bookstore.po.Orders;
import org.bookstore.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 20:20
 */
@Service
public class IOrderServiceImpl implements IOrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public void saveOrder(Orders order) {
        ordersMapper.saveOrder(order);
    }
}
