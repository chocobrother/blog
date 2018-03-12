package com.cafe24.jblog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.jblog.vo.commentVo;

public class commentDao {
public List<commentVo> getList(){
		
		List<commentVo> list = new ArrayList<commentVo>();
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		 
		 
			try {
			
			conn = getConnection();
			
			String sql = 
					" select  no, postn, content from comment";
							 
//							"  where a.postn = b.postn";
			
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				commentVo vo = new commentVo();
				
				vo.setNo(rs.getLong(1));
				
				vo.setPostn(rs.getLong(2));
				
				vo.setContent(rs.getString(3));
				
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
	
	public boolean insert(commentVo vo) {
		
		boolean result = false;
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			 
			conn = getConnection();
			
			String sql = "insert into comment values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, vo.getNo());
			pstmt.setLong(2, vo.getPostn());
			pstmt.setString(3, vo.getContent());

			
			
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