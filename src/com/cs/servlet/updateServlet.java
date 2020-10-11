package com.cs.servlet;

import com.cs.entity.UserInfo;
import com.cs.service.impl.updateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(Integer.parseInt(id));
        userInfo.setUserName(username);
        userInfo.setUserPass(password);
        userInfo.setSex(sex);
        userInfo.setAge(Integer.parseInt(age));
        userInfo.setEmail(email);
        updateServiceImpl usImpl = new updateServiceImpl();
        boolean b = usImpl.updateUser(userInfo);
        if (b){
            response.sendRedirect("pageServlet");
        }else{
            System.out.println("修改失败！");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
