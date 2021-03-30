package Ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		Connection con =null;
		
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			//오라클 접속 주소 (Ip)
			String user = "system";
			//오라클 접속 ID 
			String pass = "oracle";
			//오라클 비번
			con = DriverManager.getConnection(url,user,pass);
		}catch(Exception e ){
			e.printStackTrace();
		}
		//동적쿼리 삽입
		try {
			String sql ="insert into member values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "bbb");
			pstmt.setString(2, "bbb");
			pstmt.setString(3,"bbb");
			pstmt.setInt(4, 22);
			
			int result = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
		//동적쿼리 수정
		try {
			String sql = "update member set pwd = ?,name=?,age = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "ccc");
			pstmt.setString(2, "ccc");
			pstmt.setString(3, "43");
			pstmt.setString(4,"bbb");
			int result = pstmt.executeUpdate();
		}catch(Exception e ){
			e.printStackTrace();
		}
		
		//동적쿼리 삭제
		try {
			String sql = "delete from member where id = ? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "bbb");
			
			int result =pstmt.executeUpdate();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		//동적 쿼리
		try {
		String sql ="select *from member";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString(1);
//			String id =rs.getString("id");
			String pwd = rs.getString(2);
//			String pwd = rs.getString("pwd"); 
			String name = rs.getString(3);
//			String name = rs.getString("name");
			int age = rs.getInt(4);
//			int age = rs.getInt("age");
			System.out.println(id+","+pwd+","+name+","+age);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
