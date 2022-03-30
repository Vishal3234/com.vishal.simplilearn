

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DirectLogin
 */
public class validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private com.vishal.project.HttpServletRequest request;

    /**
     * Default constructor. 
     */
    public validation() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("email");
		String password=request.getParameter("password");

		PrintWriter out =response.getWriter();
		out.println("Without Entering Login Credentials\nLogin Succesfully");
		out.print("Your Email is "+email+" "+password);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.request = request;
		doGet(request, response);
	}

}
 47  Simplilearn/madhu/ValidationOfUser/src/main/java/package1/Hello.java 
@@ -0,0 +1,47 @@
package package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=null;
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(email.equals("madhu@gmail.com") && password.equals("madhuuu")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);

		}else {
			rd=request.getRequestDispatcher("index.html");

			PrintWriter out=response.getWriter();
			rd.include(request, response);

			out.print("<h2 <center><span style='color:red'>>Invalid Credantials....!</span></center></h2>");
		}
	}

}
 43  Simplilearn/madhu/ValidationOfUser/src/main/java/package1/SuccessServlet.java 
@@ -0,0 +1,43 @@
package package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private com.vishal.project.HttpServletRequest request;

    /**
     * Default constructor. 
     */
    public SuccessServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.request = request;
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.print("<span style='color:blue'>Your Email Id is: </span> "+email+" <span style='color:blue'> and your Password is: </span>"+password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
