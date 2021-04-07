package login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import content.DAO.ContentDBService;
import content.DAO.ContentDBServiceImpl;
import content.VO.ContentVO;

/**
 * Servlet implementation class List
 */
@WebServlet("/list")
public class contentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		ContentDBService dataSrv = new ContentDBServiceImpl();
		List<ContentVO> conlist = dataSrv.selectAllContent();
		request.setAttribute("conlist", conlist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("blogMain.jsp");
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
