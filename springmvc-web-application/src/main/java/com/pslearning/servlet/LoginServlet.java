package com.pslearning.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pslearning.service.LoginService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	LoginService service = new LoginService();
	
	@Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, java.io.IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, java.io.IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if (service.validateUser(name, password)) {
			request.setAttribute("name", name);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Invalid credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
