package com.heyuanhang.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author 何远航
 * @Date: 2021/5/29 11:04
 * @Version 1.8
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public String login(String username, String password, Model  model, HttpSession session1){
     if (username!=null&&password.equals("123")){
         //装进session
         session1.setAttribute("user",username);
         return "redirect:/main.html";
     }else {
         model.addAttribute("msg","用户名或密码错误！");
         return "index";
     }
    }
}
