package com.cafe24.jblog.test;

import java.util.List;

import com.cafe24.jblog.dao.userDao;
import com.cafe24.jblog.vo.userVo;



public class userTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		insertTest();
//		getListTest();
		
		
	}
	
		public static void insertTest() {
			userDao dao = new userDao();
			
			userVo vo = new userVo();
			
			vo.setName("차주환");
			vo.setId("ngcps2");
			vo.setPasswd("juhwan");
			dao.insert(vo); 
			
		}
		 
		public static void getListTest() {
			
			userDao dao = new userDao();
			
			List<userVo> list = dao.getList();
			
			for( userVo vo : list) {
				System.out.println( vo );
			}
		}
}
	
