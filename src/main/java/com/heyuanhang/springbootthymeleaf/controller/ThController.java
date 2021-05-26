package com.heyuanhang.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 何远航
 * @Date: 2021/5/22 16:37
 * @Version 1.8
 */
@Controller
public class ThController {
    public void show(){
        System.out.println("测试");
    }
     public void hello(){
         System.out.println("hot-fix");
     }

     public void show1(){
         System.out.println("测试gitHub push");
     }
}
