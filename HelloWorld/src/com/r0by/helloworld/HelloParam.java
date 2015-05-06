package com.r0by.helloworld;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloParam
 */
public class HelloParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloParam() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//from form
		String userName = request.getParameter("userName");
		
		//valid to All servlets -> Application in c
		String userNameOnServer = (String) request.getServletContext().getAttribute("userOnServer");
		
		// session like c
		String userNameOnSession = (String) request.getSession().getAttribute("userOnServer");
		
		//from web.xml
		String userNameDefault = (String) this.getServletConfig().getInitParameter("userDefault");
		String app = request.getServletContext().getInitParameter("applicationName");
		
		System.out.println(userNameDefault + app);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
