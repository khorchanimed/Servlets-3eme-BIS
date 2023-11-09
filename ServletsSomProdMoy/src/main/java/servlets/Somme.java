package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Somme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       int x , y , s ; 
       
       x = Integer.parseInt( request.getParameter("x") ) ; 
       y = Integer.parseInt( request.getParameter("y") ) ; 
       s = x + y ; 
       request.setAttribute("som", s) ; 
       
       response.getWriter().println(" <h1>[Servlet Somme] : ==> La somme est : " + s + "</h1>");
       request.getRequestDispatcher("moyenne").include(request, response) ; 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
