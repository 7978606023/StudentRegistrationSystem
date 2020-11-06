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

@WebServlet(name = "Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cwid = Integer.parseInt(request.getParameter("CWID"));
		String password = request.getParameter("password");
		boolean status = false;
		try {
			status = AuthClass.LogInValidation(cwid, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		if (status) {
			out.println("<h1> Welcome" + cwid + "</h1");
		} else {
			out.println("<h1> Incorrect Username or Password </h1>");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		out.println("</html>");
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
