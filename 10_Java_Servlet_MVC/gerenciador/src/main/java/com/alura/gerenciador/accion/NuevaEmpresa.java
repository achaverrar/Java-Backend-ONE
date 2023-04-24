package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresa implements Accion {
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
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
		return "redirect:entrada?accion=ListaEmpresas";
	}
}
