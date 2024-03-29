package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModificarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Empresa modificada");

		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaApertura = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Date fechaApertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			fechaApertura = sdf.parse(paramFechaApertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		DB db = new DB();
		Empresa empresa = db.buscarEmpresaPorId(id);
		
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaApertura(fechaApertura);
		
		response.sendRedirect("listaEmpresas");
	}

}
