package Ex09.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ex09.Member;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class DatabaseServiceImpl implements DatabaseService{
	  Connection con = null;
	   PreparedStatement pstmt = null;
	   ResultSet rs = null;
	   String sql = null;
	   
	   
	   public DatabaseServiceImpl()  {
	      // TODO Auto-generated constructor stub
	      try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		      String user = "system";
		      String pass = "oracle";
	     
			con = DriverManager.getConnection(url, user, pass);
	      } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      }
	   }
	   
	   @Override
	   public void insert(Member member) {
	      // TODO Auto-generated method stub
	      try {
	         sql = "insert into s_member values(?,?,?,?,?,?)";
	         pstmt = con.prepareStatement(sql);
	         
	         pstmt.setString(1, member.getName());
	         pstmt.setString(2, member.getId());
	         pstmt.setString(3, member.getPw());
	         pstmt.setString(4, member.getAge());
	         pstmt.setInt(5, member.isGender());
	         pstmt.setInt(6, member.getHobby());
	         
	         int result = pstmt.executeUpdate();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	   }

	   @Override
	   public boolean select(String id, String pw) {
	      // TODO Auto-generated method stub
	      try {
	         sql = "select count(*) from s_member where id = ? and pw = ?";
	         pstmt = con.prepareStatement(sql);
	         
	         pstmt.setString(1, id);
	         pstmt.setString(2, pw);
	         
	         rs = pstmt.executeQuery();
	         
	         rs.next();
	         int cnt = rs.getInt(1);
	         if(cnt != 0) {
	            return true;
	         }
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      return false;
	   }

	   @Override
	   public boolean checkId(String id) {
	      // TODO Auto-generated method stub
	      try {
	         sql = "select count(*) from s_member where id = ?";
	         pstmt = con.prepareStatement(sql);
	         
	         pstmt.setString(1, id);
	         
	         rs = pstmt.executeQuery();
	         rs.next();
	         
	         int result = rs.getInt(1);
	         if (result != 0) {
	            return true;
	         }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      return false;
	   }

	   @Override
	   public Member search(String id) {
	      // TODO Auto-generated method stub
	      
	      try {
	         sql = "select * from s_member where id = ?";
	         pstmt = con.prepareStatement(sql);
	         
	         pstmt.setString(1, id);
	         
	         rs = pstmt.executeQuery();
	         if(rs.next()) {
	            Member m = new Member();
	            m.setName(rs.getString(1));
	            m.setId(rs.getString(2));
	            m.setPw(rs.getString(3));
	            m.setGender(rs.getInt(5));
	            m.setAge(rs.getString(4));
	            m.setHobby(rs.getInt(6));
	            return m;
	         }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      return null;
	   }

}
