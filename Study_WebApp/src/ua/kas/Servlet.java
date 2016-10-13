package ua.kas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value = "/Servlet", description = "Мое описание сервлета", displayName = "displayName")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet.goGet()");

		// response.setContentType("text/html");
		// response.setCharacterEncoding("UTF-8");
		// or

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.print("<h3>Hello from servlet</h3><br>Привіт!");
		out.close();
	}
}
