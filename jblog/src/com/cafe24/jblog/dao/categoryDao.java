package com.cafe24.jblog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.jblog.vo.categoryVo;


public class categoryDao {
	
	
public List<categoryVo> getList(){
		
		List<categoryVo> list = new ArrayList<categoryVo>();
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		 
		
			try {
			
			conn = getConnection();
			
			String sql = 
					" select posttype, no, b.user_id" +
							"  from category a, blog b" + 
							"  where a.user_id = b.user_id";
			
			pstmt = conn.prepareStatement(sql);
			 
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				categoryVo vo = new categoryVo();
				
				vo.setGroup(rs.getString(1));
				vo.setNo(rs.getLong(2));
				vo.setUser_id(rs.getString(3));
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
	
	public boolean insert(categoryVo vo) {
		
		boolean result = false;
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			 
			conn = getConnection();
			
			String sql = "insert into category values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getGroup());
			pstmt.setLong(2, vo.getNo());
			pstmt.setString(3,vo.getUser_id());
			

			
			
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