package Quiz.q01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Quiz.q01.MemberDTO;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List listMembers(MemberDTO memberDTO) {
		List membersList = new ArrayList();
		String _id=memberDTO.getId();
		try {
			con = dataFactory.getConnection();
			String query = "select * from t_member where name=?";
				 pstmt = con.prepareStatement(query);
				 pstmt.setString(1, _id);
			
			
			
			System.out.println("prepareStatememt: " + query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberDTO dto = new MemberDTO();
				dto.setId(id);
				dto.setPwd(pwd);
				dto.setName(name);
				dto.setEmail(email);
				dto.setJoinDate(joinDate);
				membersList.add(dto);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return membersList;
	}
	public void addMember(MemberDTO memberDTO) {
		try {
			con=dataFactory.getConnection();
			String sql="INSERT INTO t_member (id,pwd,name,email) VALUES(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, memberDTO.getId());
			pstmt.setString(2, memberDTO.getPwd());
			pstmt.setString(3, memberDTO.getName());
			pstmt.setString(4, memberDTO.getEmail());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean chkID(String id) {
		boolean chk=false;
		try {
			con=dataFactory.getConnection();
			String sql = "SELECT COUNT(*) FROM t_member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			if(rs.getInt(1)==0){
				chk=true;
			}else {
				chk=false;
			}
			pstmt.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return chk;
	}
}
