package com.cs.servlet;

import com.cs.entity.UserInfo;
import com.cs.service.impl.queryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/pageServlet")
public class pageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String no = request.getParameter("no");
        if (no==null||no==""){
            no="1";
        }
        List<UserInfo> list = new queryServiceImpl().findbyServicepage(Integer.parseInt(no), 3);
        if (list.size()>0&&list!=null){
            request.setAttribute("list",list);
            request.setAttribute("no",no);
            request.setAttribute("max",new queryServiceImpl().queryServicepageCount(3));
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else {
            System.out.println("list为零");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doPost(request,response);
    }
}
