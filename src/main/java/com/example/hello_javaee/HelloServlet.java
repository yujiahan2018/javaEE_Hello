package com.example.hello_javaee;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * 初步实现JavaEE程序
 */
@WebServlet(value = "/input")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");//根据本地Java-doc中的解释,可以简单为理解设置响应的内容类型
        PrintWriter out = resp.getWriter();//响应流

        out.write("<p> <h1>Hello,My first JavaEE project!<h1> </p> <p> <h1>你好，我的首个JavaEE项目<h1> </p>");
        out.flush();
        out.close();
    }
}