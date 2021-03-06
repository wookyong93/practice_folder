package ex01;

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
		Context envContext = (Context)ctx.lookup("java:/comp/env");
		dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean loginChk(String id, String pwd) {
		boolean result = false;
			try {
				con = dataFactory.getConnection();
				String sql = "SELECT DECODE(COUNT(*),1,'true','false') AS result"
						+ " FROM t_member WHERE id=? AND pwd=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				result= Boolean.parseBoolean(rs.getString("result"));
				
				return result;
				
			}catch(Exception e) {
				
			}
		
		return result;
		
	}
	public boolean idChk(String id) {
		boolean result=false;
		try {
			Connection con = dataFactory.getConnection();
			String sql = "SELECT DECODE(COUNT(*),1,'true','false') AS result FROM t_member WHERE id=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			result = Boolean.parseBoolean(rs.getString("result"));
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
public void addMember(MemberDTO dto) {
		
		try {
			Connection con=dataFactory.getConnection();
			String sql="INSERT INTO t_member VALUES(?,?,?,?,sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			
			pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
