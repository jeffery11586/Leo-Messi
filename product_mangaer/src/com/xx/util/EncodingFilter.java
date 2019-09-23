package com.xx.util;

import javax.servlet.*;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 00:30
 */
@WebFilter(filterName = "EncodingFilter",urlPatterns = "/*")
public class EncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        
        
       
        //处理请求乱码
        req.setCharacterEncoding("utf-8");
        //处理相应乱码
        resp.setContentType("text/html;charset=utf-8");
        //判断当前过滤器之后是否还有其他过滤器，如果有继续执行，否则直接访问目标资源（jsp、html、img、Servlet）
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
