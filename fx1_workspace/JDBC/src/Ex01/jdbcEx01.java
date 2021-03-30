package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.tree.ExpandVetoException;

public class jdbcEx01 {
	public static void main(String[] args) {
		try {
			// Class.forName() : 드라이버를 JVM 올릴 수 있다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
		}
		
		// 오라클과 연결 하기 위한 클래스
		Connection con = null;
		try {
			// 연결하기 위해서는 서버IP주소, 오라클 계정명, 오라클 비밀번호
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			// "jdbc:oracle:thin:@오라클 서버 IP 주소:1521:XE"
			String user = "system";
			String pwd = "oracle";
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("오라클 연결 성공");
		} catch(Exception e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
		
		// 정적쿼리 - 입력
//		try {
//			Statement stmt = con.createStatement();
//			System.out.println("입력 Statement 객체 생성 성공");
//			
//			String sql = "insert into member values('hong','hong1234','홍길동',22)";
//			
//			int result = stmt.executeUpdate(sql);
//			System.out.println("입력 성공 : " + result);
//			
//		} catch(Exception e) {
//			System.out.println("입력 실패");
//		}
		
		// 정적쿼리 - 수정
//		try {
//			Statement stmt = con.createStatement();
//			System.out.println("수정 Statement 객체 생성 성공");
//			
//			String sql = "update member set age = 30 where id='hong'";
//			int result = stmt.executeUpdate(sql);
//			System.out.println("수정 성공 : " + result);
//		} catch(Exception e) {
//			System.out.println("수정 실패");
//		}
		
		// 정적쿼리 - 삭제
		try {
			Statement stmt = con.createStatement();
			System.out.println("삭제 Statement 객체 생성 성공");
			
			String sql = "delete from member where id = 'hong'";
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제 성공 : " + result);
		} catch(Exception e) {
			System.out.println("삭제 실패");
		}
		
		// 정적쿼리 - 조회
		try {
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 생성 성공");
			
			ResultSet rs = stmt.executeQuery("select * from member");
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.println(id + ", " + pwd + ", " + name + ", " + age);
			}
			System.out.println("출력 완료");
		}catch (Exception e) {
			System.out.println("Statement 객체 생성 실패");
		} 
		
		
		
	}
}
