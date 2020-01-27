package com.usf;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
	 Cookies cookie[]= req.getCookies();
		
		
		
		//int k= (int) req.getAttribute("k");
		HttpSession session=req.getSession();
		int k = (int) session.getAttribute("k");
		//session.removeAttribute("k");
		
		
		
		//int k= Integer.parseInt(req.getParameter("k"));
		res.getWriter().println("Hello square servlet"+k);
		
		
	

}}
