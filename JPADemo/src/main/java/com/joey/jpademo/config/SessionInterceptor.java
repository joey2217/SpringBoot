package com.joey.jpademo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Joey
 * @date 2018-06-19 17:47
 * @desc SessionInterceptor 拦截器
 **/
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        System.out.println(request.getRequestURI());
//        //登录不做拦截
//        if(request.getRequestURI().equals("/user/login") || request.getRequestURI().equals("/user/login_view"))
//        {
//            return true;
//        }
//        //验证session是否存在
//        Object obj = request.getSession().getAttribute("_session_user");
//        if(obj == null)
//        {
//            response.sendRedirect("/user/login_view");
//            return false;
//        }
//        return true;
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
