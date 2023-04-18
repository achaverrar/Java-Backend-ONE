package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// hola
@WebServlet(urlPatterns = "/hola")
public class HolaMundoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>");
		out.println("Hola Mundo");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hola Mundo! Felicitaciones por crear tu primer Servlet!");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}
}
