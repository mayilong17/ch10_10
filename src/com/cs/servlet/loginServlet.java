package com.cs.servlet;

import com.cs.entity.UserInfo;
import com.cs.service.impl.loginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    private loginServiceImpl loginService=new loginServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("username");
        String pwd  = request.getParameter("password");
        try {
            UserInfo login = loginService.login(name, pwd);
            if (login!=null){
                //System.out.println("login");
                //List<UserInfo> userInfos = new queryServiceImpl().findbyAllInfo();
                //request.setAttribute("userInfos",userInfos);
                response.sendRedirect("pageServlet");
                //request.getRequestDispatcher("/pageServlet").forward(request,response);
            }else {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
