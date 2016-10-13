package ua.kas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("info");

		// response.setContentType("text/html");
		// response.setCharacterEncoding("UTF-8");

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.print("<h3>Hello from servlet</h3><br>Привіт!");
		out.close();
	}
}
