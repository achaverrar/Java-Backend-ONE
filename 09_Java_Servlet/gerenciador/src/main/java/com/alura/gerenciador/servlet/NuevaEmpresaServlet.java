package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * the service and doPost methods receive the same parameters
	 * service() allows get requests as well as post ones
	 * doPost() only allows post requests (returning 405 errors to not allowed request)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nueva empresa registrada");
		String nombreEmpresa = request.getParameter("nombre");
		PrintWriter out = response.getWriter();
		out.println("<html><body>La empresa " + nombreEmpresa + " fue registrada!</body></html>");
	}

}
