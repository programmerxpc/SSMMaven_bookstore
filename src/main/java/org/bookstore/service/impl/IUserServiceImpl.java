package org.bookstore.service.impl;

import org.bookstore.mapper.UserinfoMapper;
import org.bookstore.po.Userinfo;
import org.bookstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 20:15
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public int register(Userinfo user) {
        Userinfo userinfo = userinfoMapper.selectUserByName(user.getUsername());
        if(userinfo != null) {//说明用户已存在
            return 1;
        }
        userinfoMapper.saveUser(user);
        return 0;
    }

    @Override
    public Userinfo Login(String username, String password) {
        Userinfo user = userinfoMapper.selectUserByNameAndPwd(username, password);
        if (user != null) {//用户名和密码都正确
            return user;
        }else {
            return null;
        }
    }
}
