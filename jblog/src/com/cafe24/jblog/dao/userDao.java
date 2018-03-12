package com.cafe24.jblog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.jblog.vo.userVo;

 

public class userDao {
 
public List<userVo> getList(){
		
		List<userVo> list = new ArrayList<userVo>();
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		 
		 
			try {
			
			conn = getConnection();
			
			String sql = "select no, id, name, passwd from user";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				userVo vo = new userVo();
				
				vo.setNo(rs.getLong(1));
				vo.setId(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setPasswd(rs.getString(4));
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
	
	public boolean insert(userVo vo) {
		
		boolean result = false;
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			 
			conn = getConnection();
			
			String sql = "insert into user values(null,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2,vo.getName());
			pstmt.setString(3, vo.getPasswd());

			
			
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