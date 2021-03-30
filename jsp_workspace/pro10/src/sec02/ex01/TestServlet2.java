package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
/* @WebServlet("/first/*") */
public class TestServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String context = request.getContextPath();
		String url = request.getRequestURL().toString();
		String mapping = request.getServletPath();
		String uri = request.getRequestURI();
		
		out.print("<html><head>");
		out.print("<title>TestServlet2</title>");
		out.print("</head>");
		out.print("<body bgcolor='yellow'>");
		out.print("<b>TestServlet2입니다.</b><br>");
		out.print("<b>콘텍스트명 : "+context +"</b><br>");
		out.print("<b>전체경로 : "+url +"</b><br>");
		out.print("<b>매핑명 : "+mapping +"</b><br>");
		out.print("<b>URI : "+uri +"</b><br>");
		out.print("</body></html>");
		out.close();
		
	}

}
