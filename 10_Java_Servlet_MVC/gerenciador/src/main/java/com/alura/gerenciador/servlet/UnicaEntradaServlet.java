package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.alura.gerenciador.accion.Accion;
import com.alura.gerenciador.accion.EliminarEmpresa;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresa;
import com.alura.gerenciador.accion.MostrarEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresaForm;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAccion = request.getParameter("accion");

		String nombreDeClase = "com.alura.gerenciador.accion." + paramAccion;

		String redirect;
		try {
			Class clase = Class.forName(nombreDeClase);
			Accion accion = (Accion) clase.newInstance();
			redirect = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}

		String[] tipoYDireccion = redirect.split(":");
		if (tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoYDireccion[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoYDireccion[1]);
		}
	}
}
