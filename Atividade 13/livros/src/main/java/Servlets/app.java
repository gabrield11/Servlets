package Servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Livro;

@WebServlet("")
public class app  extends HttpServlet{


	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Livro> livros = new LinkedList<Livro>();
		
		Livro l1 = new Livro("Frank Herbert","Duna", 2017);
		Livro l2 = new Livro("J.R.R Tolkien","O Hobbit", 2002);
		Livro l3 = new Livro("Sally Rooney","Pessoas Normais", 1995);
		Livro l4 = new Livro("Yuval Noah Harari","Sapiens", 2010);

		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);
		
		request.setAttribute("livros", livros);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); 
		dispatcher.forward(request,response);
		
		
		//response.sendRedirect("index.jsp");
		
		
	}

}
