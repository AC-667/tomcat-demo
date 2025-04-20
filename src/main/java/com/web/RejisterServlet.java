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

@WebServlet("/rejister")
public class RejisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        SqlSession sqlSession = SqlSessionFactorytool.getSqlSessionfactory().openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User u= userMapper.SeletName(username);

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();

        if(u==null){
            userMapper.insertUser(user);
            sqlSession.commit();
            sqlSession.close();
            printWriter.println("用户已创建");
        }else{
            printWriter.println("用户已存在");
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
