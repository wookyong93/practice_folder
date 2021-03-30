package Quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import oracle.jdbc.proxy.annotation.Pre;

public class StudentServiceImpl implements StudentService{
	Connection con = null;
	public StudentServiceImpl() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		try {
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id = "system";
			String pwd = "oracle";
			
			con= DriverManager.getConnection(url,id,pwd);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		try {
		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, student.getNum());
		pstmt.setString(2, student.getName());
		pstmt.setString(3, student.getMajor());
		pstmt.setInt(4, student.getYear());
		
		int result = pstmt.executeUpdate();
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		try {
		String sql = "update student set name =?,major=?,year=? where num=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, student.getName());
				pstmt.setString(2, student.getMajor());
				pstmt.setInt(3, student.getYear());
				pstmt.setInt(4, student.getNum());
				
				int result = pstmt.executeUpdate();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		try {
			String sql ="delete from student where num = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,num);
			
			int result = pstmt.executeUpdate();
			
			String sql1="delete from student where stu_no=?";
			PreparedStatement pstmt2 = con.prepareStatement(sql1);
			pstmt2.setInt(1, num);
			int result2 = pstmt2.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> select() {
		// TODO Auto-generated method stub
		List<Student> list  = new ArrayList<Student>();
		Student student = null;
		try {
			String sql = "select * from student order by num asc";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				student = new Student();
				student.setNum(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setMajor(rs.getString(3));
				student.setYear(rs.getInt(4));
				list.add(student);
			}
				return list;
			
			
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean checknum(int num) {
		// TODO Auto-generated method stub
		try {
			String sql = "select count(*) from student where num =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt !=0) {
				return true;
			}	
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void search(int num) {
		// TODO Auto-generated method stub
		try {
			String sql = "select *from student Where num =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("학번 : " +rs.getInt(1));
				System.out.println("이름 : "+rs.getString(2));
				System.out.println("학과 : "+rs.getString(3));
				System.out.println("학년 : "+rs.getInt(4));
			}else {
				System.out.println("검색된 학생이 없습니다.");
			}
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean checkMember() {
		// TODO Auto-generated method stub
		try {
			String sql = "select count(*) from student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt !=0) {
				return true;
			}
				
		}catch(Exception e ){
			e.printStackTrace();
		}
		return false;
	}

}
