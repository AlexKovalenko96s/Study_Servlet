package ua.kas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Servlet", description = "Мое описание сервлета", displayName = "displayName")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet.goGet()");

		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");

		// response.setContentType("text/html");
		// response.setCharacterEncoding("UTF-8");
		// or

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.print("<h3>Hello from get" + " " + name + " " + surname + "</h3><br>Привіт!");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet.goPost()");

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		// or

		// response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.print("<h3>Hello from post" + " " + name + " " + surname + "</h3><br>Привіт!");
		out.close();
	}
}
