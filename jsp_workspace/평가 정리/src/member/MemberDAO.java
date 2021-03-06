package member;

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
			Context ctx = new InitialContext();
			Context ctxenv = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)ctxenv.lookup("jdbc/oracle");
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public boolean LoginCheck(String id, String pwd) {
			boolean result = false;
			try {
				con = dataFactory.getConnection();
				String sql = "SELECT DECODE(COUNT(*),1,'true','false') AS result FROM t_member WHERE id=? AND pwd=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				result = Boolean.parseBoolean(rs.getString("result"));
				
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return result;
		}
}
