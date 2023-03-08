package br.edu.ifce.tjw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.tjw.BeanUtilities;
import br.edu.ifce.tjw.Carro;

/**
 * Servlet implementation class BeanServlet
 */
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Carro c = new Carro();
		BeanUtilities.populateBean(c, request);
		
		out.println("<html>");
		
		out.println("<h1>" + c.getAno() + "</h1>");
		out.println("<h1>" + c.getMarca() + "</h1>");
		out.println("<h1>" + c.getModelo() + "</h1>");
		
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
