package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection con;
	private Statement stmt;
	//statement : 정적 쿼리 : 문자열로 +''
	//preparedStatement : 동적 쿼리 ? -> 숫자
	public List listMembers() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			connDB();
			String sql = "select * from t_member";
			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name= rs.getString("name");
				String email = rs.getString("email");
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
			stmt.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	private void connDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로딩 성공");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String id = "system";
			String pwd = "oracle";
			con=DriverManager.getConnection(url,id,pwd);
			System.out.println("Connection 생성 성공");
			stmt=con.createStatement();
			System.out.println("Statement 생성성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
