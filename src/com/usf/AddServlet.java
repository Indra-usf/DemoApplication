package com.usf;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	// doPost or doGet
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		
		
		
		//ServletContext ctx=getServletContext(); //request
		ServletConfig cg=getServletConfig();
		
		//String str=ctx.getInitParameter("name");
		
		//deploydescriptor
		
		res.getWriter().println("resukt is " + str);
         
		
		/*
		 * req.setAttribute("k", k); RequestDispatcher
		 * rd=req.getRequestDispatcher("sq"); //action method? rd.forward(req,res);
		 */
		
		HttpSession session=req.getSession();
		session.setAttribute("k",k);
		
		Cookie cookie = new Cookie("k",k + "");
		res.addCookie(cookie);
		
		//res.sendRedirect("sq?k="+k);
		res.sendRedirect("sq");
		
		
		
		 
		// req dispatcher and Redirect
	}
	
	/*
	 * public void doPost(HttpServletRequest req,HttpServletResponse res) throws
	 * IOException { int i = Integer.parseInt(req.getParameter("num1")); int j=
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int k= i+j; res.getWriter().println("resukt with post is "+ k);
	 * 
	 * 
	 * }
	 */
	 

}
