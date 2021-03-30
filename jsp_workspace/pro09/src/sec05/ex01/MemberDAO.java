package sec05.ex01;

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
	public boolean isExisted(MemberDTO memberDTO) {
		boolean result = false;
		String id = memberDTO.getId();
		String pwd = memberDTO.getPwd();
		try {
			con = dataFactory.getConnection();
			String sql = "SELECT DECODE(count(*),1,'true','false') AS result FROM t_member";
			sql+=" WHERE id=? AND pwd=?";
			System.out.println(sql);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			rs.next(); // 커서를 첫번째 레코드로 위치
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result = "+result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
