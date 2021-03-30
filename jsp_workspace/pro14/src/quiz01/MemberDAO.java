package quiz01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx= new InitialContext();
			Context envContext =(Context)ctx.lookup("java:/comp/env");
			dataFactory =(DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public boolean idCheck(String id,String pwd) {
		boolean result=false;
		try {
		con=dataFactory.getConnection();
		String sql="SELECT DECODE(COUNT(*),1,'true','false') AS result FROM t_member WHERE id=? and pwd=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		result=Boolean.parseBoolean(rs.getString("result"));
		
		return result;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(id);
		return result;
	}
}