package sec01.ex01;

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
		try {
			Context ctx= new InitialContext();
			Context envContext =(Context)ctx.lookup("java:/comp/env");
			dataFactory =(DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public List listMembers() {
		List list =new ArrayList();
		try {
				con=dataFactory.getConnection();
				String sql = "SELECT * FROM t_member ORDER BY joinDate DESC";
				pstmt=con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString("id");
					String pwd = rs.getString("pwd");
					String name = rs.getString("name");
					String email = rs.getString("email");
					Date joinDate = rs.getDate("joinDate");
					MemberBean dto=new MemberBean();
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
	public void addMember(MemberBean memberBean) {
		try {
			Connection con = dataFactory.getConnection();
			String id = memberBean.getId();
			String pwd = memberBean.getPwd();
			String name =memberBean.getName();
			String email = memberBean.getEmail();
			String sql = "INSERT INTO t_member(id,pwd,name,email)VALUES(?,?,?,?)";
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
	}
