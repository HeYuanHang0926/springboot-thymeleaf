package com.heyuanhang.springbootthymeleaf.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author 何远航
 * @Date: 2021/5/29 11:48
 * @Version 1.8
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 请求处理之前执行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user == null) {
            //未登陆，不符合权限
            request.setAttribute("msg","您没有权限，请先登陆!");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;//不放行
        } else {
            return true;
        }

    }
}
