package com.pratap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pratap.dao.AuthClass;
import com.pratap.model.Student;

@WebServlet(name = "Register")
public class Register extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cwid = Integer.parseInt(request.getParameter("CWID"));
        String fName= request.getParameter("fName");
        String lName = request.getParameter("lName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
     
        System.out.println(cwid+" "+fName+" "+lName+" "+email+" "+password+" "+password2);
        Student stu = new Student(cwid, fName,lName,email,password,password2);
        int status = 0;
        try {
            status = AuthClass.Registration(stu);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!Doctype HTML>");

        if(status  == 0){

            out.println("Registration failed! Please try again");
            request.getRequestDispatcher("registration.jsp").include(request,response);
        }

        else {

            out.println("<h1>Thank you for registration </h1>");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
