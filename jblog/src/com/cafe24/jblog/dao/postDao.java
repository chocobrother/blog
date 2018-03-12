package com.cafe24.jblog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.jblog.vo.postVo;

public class postDao {
	
public List<postVo> getList(){
		
		List<postVo> list = new ArrayList<postVo>();
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		 
		 
			try {
			
			conn = getConnection();
			
			String sql = 
					" select  title, postn, content, postdate, b.posttype" +
							"  from post a, category b" + 
							"  where a.posttype = b.posttype";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				postVo vo = new postVo();
				 
				vo.setTitle(rs.getString(1));

				vo.setPostn(rs.getLong(2));
				vo.setContent(rs.getString(3));
				vo.setPostdate(rs.getString(4));
				vo.setPosttype(rs.getString(5));
				
				list.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn!= null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		 
		return list;
		
	}
	
	public boolean insert(postVo vo) {
		
		boolean result = false;
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			 
			conn = getConnection();
			
			String sql = "insert into post values(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			

			pstmt.setString(1, vo.getTitle());
			pstmt.setLong(2, vo.getPostn());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getPostdate());
			pstmt.setString(5, vo.getPosttype());
			
			int count = pstmt.executeUpdate();
			
			result = (count >=1);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn!= null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
 
	
private Connection getConnection() throws SQLException {
		
		Connection conn = null;
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			
			String url="jdbc:mysql://localhost/jblog";
			conn = DriverManager.getConnection(url, "jblog", "jblog");
		} catch( ClassNotFoundException e ) {
			System.out.println( "드러이버 로딩 실패:" + e );
		} 
		
		return conn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}