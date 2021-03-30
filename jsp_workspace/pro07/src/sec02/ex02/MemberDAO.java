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
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		//생성자로 오라클 DB 연결 
		try {
				Context ctx = new InitialContext();
				Context envContext = (Context)ctx.lookup("java:comp/env");
				dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List<MemberDTO> listMembers(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
				con = dataFactory.getConnection();
				String sql = "SELECT * FROM t_member";
				pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					String id = rs.getString("id");
					String pwd = rs.getString("pwd");
					String name =rs.getString("name");
					String email =rs.getString("email");
					Date joinDate = rs.getDate("joinDate");
					
					MemberDTO dto = new MemberDTO();
					dto.setId(id);
					dto.setPwd(pwd);
					dto.setName(name);
					dto.setEmail(email);
					dto.setJoinDate(joinDate);
					list.add(dto);
				}
				rs.close();
				pstmt.close();
				con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void addMember(MemberDTO memberDTO) {
		try{
				con=dataFactory.getConnection();
				String id = memberDTO.getId();
				String pwd = memberDTO.getPwd();
				String name = memberDTO.getName();
				String email = memberDTO.getEmail();
				String sql = "INSERT INTO t_member";
				sql +="(id,pwd,name,email)";
				sql += "values(?,?,?,?)";
				
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				pstmt.executeUpdate();
				pstmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delMember(String id) {
		try {
			con=dataFactory.getConnection();
			String sql = "DELETE FROM t_member WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.close();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	public void updateMember(MemberDTO dto) {
		try {
			con=dataFactory.getConnection();
			String sql = "UPDATE t_member SET pwd=?,name=?,email=? WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getPwd());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getId());
			pstmt.executeUpdate();
			pstmt.close();			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
