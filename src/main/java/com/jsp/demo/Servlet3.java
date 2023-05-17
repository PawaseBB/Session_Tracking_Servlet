package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession= req.getSession();
		httpSession.removeAttribute("sanme");
		httpSession.invalidate();
		
		
	
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body> <h1>"+"Logged out of my Website "+"<h1></body></html>");
	}
}
