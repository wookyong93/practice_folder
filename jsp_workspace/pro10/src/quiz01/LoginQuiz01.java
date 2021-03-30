package quiz01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginQuiz01
 */
@WebServlet("/quizlogin")
public class LoginQuiz01 extends HttpServlet {
	ServletContext context = null;
	   List user_list = new ArrayList();

	   /**
	    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	    *      response)
	    */
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      context = getServletContext();
	      PrintWriter out = response.getWriter();
	      HttpSession session = request.getSession();
	      String user_id = request.getParameter("user_id");
	      String user_pw = request.getParameter("user_pw");
	      LoginImpl loginUser = new LoginImpl(user_id, user_pw);
	      
	      if(user_list.contains(user_id)) {
	         out.print("이미 로그인 되어 있습니다.<br>");
	         int cnt = (int) context.getAttribute(user_id);
	         if (cnt >= 5) {
	            out.print("<script>alert('접속 로그인 수 초과');location.href='login2.html';</script>");
	         }
	         context.setAttribute(user_id, ++cnt);
	      } else if (session.isNew()) {
	         session.setAttribute("loginUser", loginUser);
	         user_list.add(user_id);
	         context.setAttribute("user_list", user_list);
	         context.setAttribute(user_id, 1);
	      }

	      out.println("<html><body>");
	      out.println("아이디는 " + loginUser.user_id + "<br>");
	      out.println("총 접속자수는" + LoginImpl.total_user + "<br><br>");
	      out.println("현재 아이디 접속 세션 수 : " + context.getAttribute(user_id) + "<br>");
	      out.println("접속 아이디:<br>");
	      List list = (ArrayList) context.getAttribute("user_list");
	      for (int i = 0; i < list.size(); i++) {
	         out.println(list.get(i) + "<br>");
	      }
	      out.println("<a href='logout?user_id=" + user_id + "'>로그아웃 </a>");
	      out.println("</body></html>");
	   }

}
