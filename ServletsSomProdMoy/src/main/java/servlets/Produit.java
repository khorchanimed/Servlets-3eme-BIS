package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Produit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		 int x , y  ; 
	       
	       x = Integer.parseInt( request.getParameter("x") ) ; 
	       y = Integer.parseInt( request.getParameter("y") ) ; 
	     	       
	       response.getWriter().println("<h1>[Servlet Produit]: ==> Le produit est : " + x*y + "</h1>");			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
