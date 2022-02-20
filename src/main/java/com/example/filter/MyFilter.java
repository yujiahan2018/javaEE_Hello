package com.example.filter;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过过滤器实现中文输出（自己实现）
 */
@WebServlet(value = "/*")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest srq = (HttpServletRequest) servletRequest;//客户端发送请求
        HttpServletResponse srp = (HttpServletResponse) servletResponse;//服务器处理响应

        srq.setCharacterEncoding("UTF-8");
        srp.setCharacterEncoding("UTF-8");

        filterChain.doFilter(srq,srp);

    }
}
