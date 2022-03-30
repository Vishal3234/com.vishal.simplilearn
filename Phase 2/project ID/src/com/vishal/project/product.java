
package com.vishal.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productid")
public class productid extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		String pid = request.getParameter("productid");
		
		PrintWriter out = response.getWriter();
		
		String query="select * from product where p_id = ?";
		
		out.print("<h1>Product Deatails</h1>");
		
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Nmae</th><th>Product bill</th></tr>");
		try
		
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
		PreparedStatement st= dbCon.prepareStatement(query);
		st.setString(1, pid);
		ResultSet rs =st.executeQuery();
		
		while(rs.next()) {
			out.print("<tr><td>");
			out.println(rs.getInt(1));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(2));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getInt(3));
			out.print("</td>");
			out.print("</tr>");
			}
		
		
	}
		
		catch(Exception e)
		{
		
			System.out.println("Some Issue : "+ e.getMessage());
		
		}
		
		out.print("</table>");
		
	}
		
}


