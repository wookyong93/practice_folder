package sec02.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public boolean overlappedId(String id) {
		boolean result = false;
			try {
				con=dataFactory.getConnection();
				String sql="SELECT DECODE(COUNT(*),1,'true','false) AS result FROM t_member WHERE id=?";
				pstmt =con.prepareStatement(sql);
				pstmt.setString(1,id);
				ResultSet rs = pstmt.executeQuery();
				result = Boolean.parseBoolean(rs.getString("result"));
				pstmt.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		return result;
	}
}
