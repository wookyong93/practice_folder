package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/input2")*/
public class inputServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Enumeration enu=request.getParameterNames();
		
		while(enu.hasMoreElements()) {
			String name=(String)enu.nextElement();
			String[] values=request.getParameterValues(name);
			for(String value : values) {
				System.out.println("name="+name+",vlaue="+value);
			}
		}
	}


}
