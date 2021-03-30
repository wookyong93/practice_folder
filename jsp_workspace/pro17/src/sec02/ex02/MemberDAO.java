package sec02.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private DataSource dataFactory;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public MemberDAO(){
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
				
		}
	}
	
	public List<MemberDTO> listMember(){
		List<MemberDTO> membersList = new ArrayList<MemberDTO>();
		try {
			con=dataFactory.getConnection();
			String sql = "SELECT * FROM t_member ORDER BY joinDate DESC";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberDTO dto = new MemberDTO(id,pwd,name,email,joinDate);
				membersList.add(dto);
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	return membersList;
	}
	public void addMember(MemberDTO dto) {
		try {
			con=dataFactory.getConnection();
			String id = dto.getId();
			String pwd =dto.getPwd();
			String name= dto.getName();
			String email= dto.getEmail();
			String sql= "INSERT INTO t_member(id,pwd,name,email) VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public MemberDTO findMembers(String _id) {
		MemberDTO memInfo = null;
		try {
			con=dataFactory.getConnection();
			String sql = "SELECT * FROM t_member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, _id);
			rs = pstmt.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email =rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			memInfo = new MemberDTO(id,pwd,name,email,joinDate);
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	 return memInfo;
	}
	public void modMember(MemberDTO dto) {
		String id = dto.getId();
		String pwd = dto.getPwd();
		String name=dto.getName();
		String email=dto.getEmail();
		try {
			con = dataFactory.getConnection();
			String sql="UPDATE t_member SET pwd=?,name=?, email=? WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, pwd);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delMember(String id) {
		try {
			con = dataFactory.getConnection();
			String sql="DELETE FROM t_member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
