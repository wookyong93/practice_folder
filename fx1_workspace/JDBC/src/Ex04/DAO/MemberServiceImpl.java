package Ex04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ex04.DTO.Member;

public class MemberServiceImpl implements Memberservice{
	Connection con = null;
	
	public MemberServiceImpl(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("����̹� ��� ����");
		}
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pwd = "oracle";
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("����Ŭ ���� ����");
		} catch(Exception e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
	}
	
	public boolean checkId(String id) {
		try {
			String sql = "select count(*) from member where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt != 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void insert(Member member) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,member.getId());
			pstmt.setString(2,member.getPwd());
			pstmt.setString(3,member.getName());
			pstmt.setInt(4,member.getAge());
			
			
			int result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		try {
			String sql = "update member set pwd =?, name =? , age =? where id=?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			pstmt.setString(1, member.getPwd());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getId());
			
			
			int result = pstmt.executeUpdate();
		} catch(Exception e) {
		}
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from member where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,id);
			
			
			int result = pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("���� ����");
		}
	}

	@Override
	public List<Member> select() {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<Member>();
		Member member = null;
		try {
			String sql= "select * from member order by id desc";
			PreparedStatement pstmt = con.prepareStatement(sql);
	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setPwd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setAge(rs.getInt(4));
				memberList.add(member);
			}
			return memberList;
		}catch (Exception e) {
			System.out.println("Statement ��ü ���� ����");
		} 
		return null;
	}

	@Override
	public void search(String id) {
		// TODO Auto-generated method stub
		try{
		
		String sql = "select*from member where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("ID : "+rs.getString(1));
			System.out.println("PW : "+rs.getString(2));
			System.out.println("�̸�: "+rs.getString(3));
			System.out.println("���� : "+rs.getInt(4));
		}else {
			System.out.println("�˻��� ȸ�� ���̵� �����ϴ�.");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkMember() {
		// TODO Auto-generated method stub
		try{
			String sql = "select count(*) from member";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt !=0) {
				return true;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}

}
