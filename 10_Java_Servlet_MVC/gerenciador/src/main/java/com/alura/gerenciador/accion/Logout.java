package com.alura.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Logout implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		// Removes an attribute from the session
		// sesion.removeAttribute("loginUsuario");

		// Removes the whole session
		sesion.invalidate();

		return "redirect:entrada?accion=LoginForm";
	}

}
