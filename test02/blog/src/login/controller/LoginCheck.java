package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.service.LoginService;
import login.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		PrintWriter out =response.getWriter();
		HttpSession session = request.getSession();
		
		LoginService logSrv = new LoginServiceImpl();
		
		boolean result = logSrv.loginCheck(id, pwd);
		
		if(result==true) {
			session.setAttribute("loginID", id);
			out.print("<script>alert('Login Success!!!!'); location.href='blogMain.jsp';</script>");
		}else {
			out.print("<script>alert('Login Fail...'); location.href='blogMain.jsp';</script>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
