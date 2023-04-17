package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * the service and doPost methods receive the same parameters service() allows
	 * get requests as well as post ones doPost() only allows post requests
	 * (returning 405 errors to not allowed request)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Nueva empresa registrada");

		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaApertura = request.getParameter("fecha");
		Date fechaApertura = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			fechaApertura = sdf.parse(paramFechaApertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaApertura(fechaApertura);

		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);

		// The code below causes client side redirection
		// Do not use a backslash at the beginning of the string
		response.sendRedirect("listaEmpresas");

		// The code below causes server side redirection
		// Call JSP file
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNombre());
//		rd.forward(request, response);
	}

}
