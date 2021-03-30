package Program.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Program.DTO.Score;
import Program.DTO.Student;

public class DataServiceImpl implements DataService{
	String sql = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public DataServiceImpl() throws Exception {
		// TODO Auto-generated constructor stub
		getClass().forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "system";
		String pw = "oracle";
		
		con =DriverManager.getConnection(url,id,pw);
	}
	@Override
	public boolean insert(Student stu, Score sco) {
		// TODO Auto-generated method stub
		try {
		sql = "insert into student values(?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, stu.getStu_no());
		pstmt.setString(2, stu.getStu_name());
		pstmt.setInt(3, stu.getStu_year());
		
		int result = pstmt.executeUpdate();
		
		sql="insert into score values(seq.nextval,?,?,?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, sco.getKor());
		pstmt.setInt(2, sco.getEng());
		pstmt.setInt(3, sco.getMath());
		pstmt.setInt(4, sco.getSum());
		pstmt.setDouble(5, sco.getAvg());
		pstmt.setInt(6, stu.getStu_no());
		
		result += pstmt.executeUpdate();
		
		return true;
		
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Student stu, Score sco) {
		// TODO Auto-generated method stub
		try {
			sql = "select count(*) from student where stu_no = ?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, stu.getStu_no());
			rs = pstmt.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if (cnt ==1);{
			
			sql = "update student set stu_name =?,stu_year=? where stu_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, stu.getStu_name());
			pstmt.setInt(2, stu.getStu_year());
			pstmt.setInt(3, stu.getStu_no());
			
			int result = pstmt.executeUpdate();
			
			sql="update score set kor =?,eng=?,math=?,sum=?,avg=? where stu_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sco.getKor());
			pstmt.setInt(2, sco.getEng());
			pstmt.setInt(3, sco.getMath());
			pstmt.setInt(4, sco.getSum());
			pstmt.setDouble(5, sco.getAvg());
			pstmt.setInt(6, stu.getStu_no());
			
			result += pstmt.executeUpdate();
			
			return true;
			
			
			}
		}catch(Exception e ) {
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean delete(int stu_no) {
		// TODO Auto-generated method stub
		try{sql="delete from student where stu_no = ?";
		pstmt =con.prepareStatement(sql);
		pstmt.setInt(1, stu_no);
		
		int result = pstmt.executeUpdate();
		if(result >= 1) {
			return true;
		}
		}catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public void search(int stu_no) {
		// TODO Auto-generated method stub
		try{sql="select * from student where stu_no = ?";
		pstmt =con.prepareStatement(sql);
		pstmt.setInt(1, stu_no);
		
		rs = pstmt.executeQuery();
		if(rs.next()) {
		System.out.println("학번 : "+rs.getInt(1));
		System.out.println("이름 : "+rs.getString(2));
		System.out.println("학년 : "+rs.getInt(3));
		sql="select * from score where stu_no = ?";
		pstmt =con.prepareStatement(sql);
		pstmt.setInt(1, stu_no);
		
		rs = pstmt.executeQuery();
		rs.next();
		System.out.println("국어 : "+rs.getInt(2));
		System.out.println("영어 : "+rs.getInt(3));
		System.out.println("수학 : "+rs.getInt(4));
		System.out.println("총점 : "+rs.getInt(5));
		System.out.println("평균 : "+rs.getDouble(6));
		
		}else {
			System.out.println("찾으시는 학번이 없습니다.");
		}
			
		}catch(Exception e) {
			
		}
		
	}

}
