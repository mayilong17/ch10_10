package com.cs.servlet;

import com.cs.entity.UserInfo;
import com.cs.service.impl.queryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/queryServlet")
public class queryServlet extends HttpServlet {
    private queryServiceImpl queryService=new queryServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String comm = request.getParameter("comm");
        UserInfo us = queryService.findByidUserInfoService(Integer.parseInt(id));
        if (us!=null){
            request.setAttribute("us",us);
            if ("query".equals(comm)){
                request.getRequestDispatcher("queryID.jsp").forward(request,response);
            }else if ("update".equals(comm)){
                request.getRequestDispatcher("updateID.jsp").forward(request,response);
            }
        }else {
            System.out.println("us为空！！");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
