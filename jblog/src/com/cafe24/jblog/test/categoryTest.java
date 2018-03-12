package com.cafe24.jblog.test;

import java.util.List;

import com.cafe24.jblog.dao.categoryDao;
import com.cafe24.jblog.dao.userDao;
import com.cafe24.jblog.vo.categoryVo;
import com.cafe24.jblog.vo.userVo;

public class categoryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		insertTest();
		
		getListTest();
		
		
	}
	
		public static void insertTest() {
			categoryDao dao = new categoryDao();
			
			categoryVo vo = new categoryVo();
			
			vo.setGroup("취미"); 
			vo.setNo((long) 3); 
			vo.setUser_id("ngcps2");
			dao.insert(vo); 
			
		} 
		 
		public static void getListTest() {
			
			categoryDao dao = new categoryDao();
			
			List<categoryVo> list = dao.getList();
			 
			for( categoryVo vo : list) {
				System.out.println( vo );
			}
		}
}
	
