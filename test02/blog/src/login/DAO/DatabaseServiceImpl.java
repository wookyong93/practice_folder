package login.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseServiceImpl implements DatabaseService {
	private Connection con;
	private DataSource dataFactory;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DatabaseServiceImpl(){
		try {
				Context ctx = new InitialContext();
				Context envContext = (Context)ctx.lookup("java:/comp/env");
				dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean loginCheck(String id, String pwd) {
		boolean result = false;
		try {
			//�α��ο��� ���� ID,PWD �� �����ͺ��̽��� �����ϴ� �� Ȯ���Ͽ� �����ϸ� 1 �̶� ���� true�� �ƴϸ� false�� ��ȯ�Ͽ� result�� ����Ѵ�.
			con = dataFactory.getConnection();
			String query = "SELECT DECODE(COUNT(*),1,'true','false') AS result FROM blog_member WHERE id=? AND pwd=?";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs  = pstmt.executeQuery();
			rs.next();
			result = Boolean.parseBoolean(rs.getString("result"));
			//result�� ��¹��� ���� boolean ���� ����ȯ�Ͽ� result ���� �����Ѵ�.
			System.out.println(result);
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
