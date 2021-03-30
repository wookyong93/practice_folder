package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SesscionTest2
 */
@WebServlet("/sess3")
public class SesscionTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("세션아이디 : "+session.getId()+"<br>");
		out.println("최초 세션 생성시간 : "+new Date(session.getCreationTime())+"<br>");
		out.println("최근 세션 전급 시각 : "+new Date(session.getLastAccessedTime())+"<br>");
		
		out.print("기본 세션 유효시간 : "+session.getMaxInactiveInterval()+"<br>");
		session.setMaxInactiveInterval(5);
		//세션유효시간 설정
		out.print("세션 유효 시간 : "+session.getMaxInactiveInterval()+"<br>");
		
		if(session.isNew()) {
			out.print("새로운 세션이 만들어졌습니다.");
		}
		session.invalidate();
	}

}
