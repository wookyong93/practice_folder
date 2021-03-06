package ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ExMemberDAO {
		private Connection con;
		private PreparedStatement pstmt;
		private DataSource dataFactory;
	public ExMemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context contextEnv = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) contextEnv.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List memList(ExMemberDTO dto) {
		List memList = new ArrayList();
		try {
			con = dataFactory.getConnection();
			String sql = "SELECT * FROM ex_mem ";
			pstmt= con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("user_id");
				String pw = rs.getString("user_pw");
				String name = rs.getString("user_name");
				String email = rs.getString("user_email");
				Date joinDate = rs.getDate("joinDate");
				dto = new ExMemberDTO();
				dto.setUser_id(id);
				dto.setUser_pw(pw);
				dto.setUser_name(name);
				dto.setUser_email(email);
				dto.setJoinDate(joinDate);
				memList.add(dto);
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return memList;
	}
	public boolean loginChk(String id, String pw) {
		boolean result = false;
		try {
			Connection con= dataFactory.getConnection();
			String sql = "SELECT DECODE(COUNT(*),1,'true','false') AS result "
					+ "FROM ex_mem WHERE user_id=? AND user_pw=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			result = Boolean.parseBoolean(rs.getString("result"));
			
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		return result;
	}
	public void addMember(ExMemberDTO dto) {
		
		try {
			Connection con=dataFactory.getConnection();
			String sql="INSERT INTO ex_mem VALUES(?,?,?,?,sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getUser_id());
			pstmt.setString(2, dto.getUser_pw());
			pstmt.setString(3, dto.getUser_name());
			pstmt.setString(4, dto.getUser_email());
			
			pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public boolean idChk(String id) {
		boolean result=false;
		try {
			Connection con = dataFactory.getConnection();
			String sql = "SELECT DECODE(COUNT(*),1,'true','false') AS result FROM ex_mem WHERE user_id=?";
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
}
