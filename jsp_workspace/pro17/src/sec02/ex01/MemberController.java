package sec02.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/member/*")*/
public class MemberController extends HttpServlet {
	
	MemberDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao=new MemberDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage= null;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTf-8");
		String action =request.getPathInfo();
		System.out.println(action);
		if(action == null || action.equals("/listMembers.do")) {
			List<MemberDTO> membersList = dao.listMember();
			request.setAttribute("membersList", membersList);
			nextPage="/test02/listMembers.jsp";
		}else if(action.equals("/addMember.do")) {
			String id =request.getParameter("id");
			String pwd =request.getParameter("pwd");
			String name=request.getParameter("name");
			String email = request.getParameter("email");
			MemberDTO dto = new MemberDTO(id,pwd,name,email);
			dao.addMember(dto);
			nextPage="/member/listMembers.do";
		}else if(action.equals("/memberForm.do")) {
			nextPage="/test02/memberForm.jsp";
		}else {
			List<MemberDTO> membersList = dao.listMember();
			request.setAttribute("membersList", membersList);
			nextPage="/test02/listMembers.jsp";
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
}
