package br.edu.ifce.tjw.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("formLogin.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");
		
		if (nomeUsuario.equals("admin") && senhaUsuario.equals("123")) {
			request.getSession().setAttribute("usuario", nomeUsuario);
			response.sendRedirect("email.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("formLogin.html");
			dispatcher.forward(request, response);
		}
	}

}
