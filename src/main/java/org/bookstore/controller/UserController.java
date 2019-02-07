package org.bookstore.controller;

import org.bookstore.po.Userinfo;
import org.bookstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 23:05
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/register")
    public ModelAndView register(Userinfo user) {
        ModelAndView modelAndView = new ModelAndView();

        int i = userService.register(user);

        if (i == 1) {//用户名已存在
            modelAndView.addObject("user", user);
            modelAndView.setViewName("register_failure");
            return modelAndView;
        }

        modelAndView.addObject("user", user);
        modelAndView.setViewName("register_success");

        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(Userinfo user, HttpSession session) {

        String username = user.getUsername();
        String password = user.getPassword();
        ModelAndView modelAndView = new ModelAndView();

        Userinfo user2 = userService.Login(username, password);
        if(user2 != null) {
            session.setAttribute("user", user2);
            modelAndView.setViewName("login_success");
            return modelAndView;
        }

        modelAndView.addObject("msg", "用户名或密码错误!");
        modelAndView.setViewName("login");
        return modelAndView;
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
//		return null;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");

        return "login";
    }
}
