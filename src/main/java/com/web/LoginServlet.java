package com.web;

import com.mapper.UserMapper;
import com.prjo.User;
import com.tool.SqlSessionFactorytool;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        SqlSession sqlSession = SqlSessionFactorytool.getSqlSessionfactory().openSession();

        UserMapper usermaper=sqlSession.getMapper(UserMapper.class);
        User user= usermaper.select(username,password);

        sqlSession.close();

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        //判断
        if(user!=null){
            printWriter.println("登陆成功");
        }else{
            printWriter.println("登陆失败");
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doGet(req, resp);
    }

}
