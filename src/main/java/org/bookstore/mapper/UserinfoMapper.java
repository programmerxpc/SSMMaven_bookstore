package org.bookstore.mapper;

import org.bookstore.po.Userinfo;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:52
 */
public interface UserinfoMapper {
    //保存用户信息
    public void saveUser(Userinfo user);

    //根据姓名查询用户
    public Userinfo selectUserByName(String username);

    //根据用户名和密码查询用户
    public Userinfo selectUserByNameAndPwd(String username, String password);
}
