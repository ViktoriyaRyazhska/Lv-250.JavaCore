package com.edu.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		HashMap<String, Integer> country = new HashMap<String, Integer>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://" 
					+ "localhost:3306/world", login, password);
			Statement myStatement = myConnection.createStatement();
			ResultSet myResultSet = myStatement.executeQuery("SELECT * FROM country" 
			+ " WHERE IndepYear IS NOT NULL AND IndepYear > 0");

			while (myResultSet.next()) {
				country.put(myResultSet.getString("Name"), myResultSet.getInt("IndepYear"));
			}

			myConnection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			PrintWriter out = response.getWriter();
			out.write("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">"
					+ "<title>Login</title><link href=\"style.css\" rel=\"stylesheet\">"
					+ "<style> .text {text-align: center;}</style></head><body>"
					+ "<div class=\"myclass\"><p>ACCESS DENIED</p></div>" + "</body></html>");
			out.close();
		}

		PrintWriter out = response.getWriter();
		
		out.write("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">"
				+ "<title>Login</title><link href=\"style.css\" rel=\"stylesheet\">"
				+ "<style> .text {text-align: left;}</style></head><body>"
				+ "<div class=\"text\"><p>Countries, which became independent " 
				+ "during World War II<br>");

		for (Map.Entry<String, Integer> entry : country.entrySet()) {
			if (entry.getValue() >= 1939 && entry.getValue() <= 1945) {

				out.write(entry.getValue() + " " + entry.getKey() + "<br>");
			}
		}
		out.write("</p></div></body></html>");
		
		out.close();

	}

}
