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

public class ModificarEmpresa implements Accion {
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		return "redirect:entrada?accion=ListaEmpresas";
	}
}
