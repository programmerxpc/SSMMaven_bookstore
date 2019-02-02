package org.bookstore.service;

import org.bookstore.po.Userinfo;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:55
 */
public interface IUserService {
    /**
     * 用户注册
     * @param user
     * @return 如果返回1，则说明用户存在，返回0说明用户不存在
     */
    public int register(Userinfo user);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public Userinfo Login(String username,String password);
}
