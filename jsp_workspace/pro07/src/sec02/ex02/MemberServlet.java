package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member3")
public class MemberServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		MemberDAO dao = new MemberDAO();
		PrintWriter out = response.getWriter();
		String command = request.getParameter("command");
		if(command != null && command.equals("addMember")) { 
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email =request.getParameter("email");
			
			MemberDTO dto = new MemberDTO();
			dto.setId(_id);
			dto.setPwd(_pwd);
			dto.setName(_name);
			dto.setEmail(_email);
			dao.addMember(dto);
		}else if(command!=null && command.equals("delMember")) {
			String id = request.getParameter("id");
			dao.delMember(id);
		}else if(command!=null && command.equals("updateMember")) {
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email =request.getParameter("email");
			
			MemberDTO dto = new MemberDTO();
			dto.setId(_id);
			dto.setPwd(_pwd);
			dto.setName(_name);
			dto.setEmail(_email);
			dao.updateMember(dto);
			
			out.print("<html><body>");
			String id =request.getParameter("id");
			out.print("<h3>"+id+"???????????? ?????? </h3><form action='member3' method='post'>");
			out.print("????????? : <input type='text' name ='id' value='"+id+"' disabled=disable><br>");
			out.print("???????????? : <input type='password' name ='pwd'><br>");
			out.print("?????? : <input type='text' name ='name'><br>");
			out.print("????????? : <input type='text' name ='email'><br>");
			out.print("<input type='hidden' name='re_id' value='"+id+"'>");
			out.print("<input type='hidden' name='command' value='upadteMember'>");
			out.print("<input type='submit' value='????????????'><br>");
			out.print("</form></body></html>");
			return;
			
		} // ?????? ?
	
		List list =dao.listMembers();
		out.print("<html><body>");
		out.print("<table border =1 ><tr align ='center' bgcolor='lightgreen'>");
		out.print("<td>?????????</td><td>????????????</td><td>??????</td><td>?????????</td><td>?????????</td><td>??????</td><td>??????</td></tr>");
		
		for(int i = 0 ;i<list.size();i++) {
			MemberDTO memberDTO = (MemberDTO) list.get(i);
			String id = memberDTO.getId();
			String pwd = memberDTO.getPwd();
			String name = memberDTO.getName();
			String email = memberDTO.getEmail();
			Date joinDate = memberDTO.getJoinDate();
			out.print("<tr><td>"+id+"</td><td>"
		                +pwd+"</td><td>"
		                +name+"</td><td>"
		                +email+"</td><td>"
		                +joinDate+"</td><td>"
	                    +"<a href='/pro07/member3?command=delMember&id="+id+"'>?????? </a></td>"
	                    + "<td><a href='/pro07/member3?command=updateMember&id="+id+"'>??????</a></tr>");
		}
		out.print("</table></body></html>");
		out.print("<a href='/pro07/memberForm.html'>??? ?????? ????????????</a");
	}
}
