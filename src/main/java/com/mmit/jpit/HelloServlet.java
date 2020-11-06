package com.mmit.jpit;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(urlPatterns = {"/hello","/home"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		p.write("<h1>Hello Servlet</h1>");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.append("<h1>Hello from Servlet</h1>");
		writer.append("<input value='MMIT' />/<br>");
		writer.append("<a href='index.html'>Home</a><br/>");
		writer.append("Current Date: "+LocalDate.now());
	}
	
}
