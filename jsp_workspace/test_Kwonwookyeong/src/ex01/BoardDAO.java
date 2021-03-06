package ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	public List boardList(BoardDTO Bdto) {
		List bList = new ArrayList();
		try {
			con= dataFactory.getConnection();
			String sql="SELECT * FROM t_board ORDER BY writeDate DESC,articleNO DESC";
			pstmt=con.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				Bdto=new BoardDTO();
				Bdto.setArticleNO(rs.getInt("articleNO"));
				Bdto.setParentNO(rs.getInt("parentNO"));
				Bdto.setTitle(rs.getString("title"));
				Bdto.setContent(rs.getString("content"));
				Bdto.setImageFileName(rs.getString("ImageFileName"));
				Bdto.setId(rs.getString("id"));
				Bdto.setWriteDate(rs.getDate("writeDate"));
				bList.add(Bdto);
				
			}
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bList;
	}
	public List viewBoard(int no) {
		List viewB = new ArrayList();
		try {
			Connection con = dataFactory.getConnection();
			String sql="SELECT * FROM t_board WHERE articleNO=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto=new BoardDTO();
				int articleNO = rs.getInt("articleNO");
				int parentNO = rs.getInt("parentNO");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String id = rs.getString("id");
				
				String ImageFileName= rs.getString("ImageFileName");
				Date writeDate = rs.getDate("writeDate");
				
				dto.setArticleNO(articleNO);
				dto.setParentNO(parentNO);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setImageFileName(ImageFileName);
				dto.setId(id);
				dto.setWriteDate(writeDate);
				viewB.add(dto);
			}
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return viewB;
	}
	public void viewDel(int no) {
		try {
			con=dataFactory.getConnection();
			String sql="DELETE FROM t_board WHERE articleNO=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int wirteNum() {
		int num = 0;
			try {
				con = dataFactory.getConnection();
				String sql="select * from (select * from t_board order by ROWNUM desc) where ROWNUM = 1";
				pstmt =con.prepareStatement(sql);
				
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				num = rs.getInt("articleNO")+1;
				return num;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		return num;
	}
	public void writeCon(BoardDTO dto) {
		try {
			con =dataFactory.getConnection();
			String sql = "INSERT INTO t_board(articleNO,title,content,id";
				if(dto.getImageFileName().equals(null)) {
				sql+=") VALUES(?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, dto.getArticleNO());
				pstmt.setString(2, dto.getTitle());
				pstmt.setString(3, dto.getContent());
				pstmt.setString(4, dto.getId());
				}else {
				sql+=",imageFileName) VALUES(?,?,?,?,?)";

				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, dto.getArticleNO());
				pstmt.setString(2, dto.getTitle());
				pstmt.setString(3, dto.getContent());
				pstmt.setString(4, dto.getId());
				pstmt.setString(5, dto.getImageFileName());
				}	
				pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
