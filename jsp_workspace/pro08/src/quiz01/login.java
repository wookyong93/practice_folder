package quiz01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
/* @WebServlet("/login") */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String id = (String) request.getAttribute("id");
		String pwd = (String) request.getAttribute("pwd");
		RequestDispatcher dispatcher;
		System.out.println(id +","+pwd);
		
		ServletContext context = getServletContext();
		context.setAttribute("id", id);
		
		if(id.equals("user") && pwd.equals("1234")) {
			System.out.println("성공");
			dispatcher = request.getRequestDispatcher("LoginSuccess");
			
		}else {
			System.out.println("실패");
			dispatcher = request.getRequestDispatcher("LoginFail");
			
		}
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
