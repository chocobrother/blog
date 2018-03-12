package com.cafe24.jblog.test;

import java.util.List;

import com.cafe24.jblog.dao.blogDao;
import com.cafe24.jblog.dao.userDao;
import com.cafe24.jblog.vo.blogVo;
import com.cafe24.jblog.vo.userVo;

public class blogTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		insertTest();
		
//		getListTest();
		
		
		
	}
	
		public static void insertTest() {
			blogDao dao = new blogDao();
			
			blogVo vo = new blogVo();
			
			vo.setUser_id("ngcps2");
			vo.setTitle("차주환의 블로그입니다.");
			vo.setImage("image src = 'juhwan'");
			dao.insert(vo);
			
		}
		 
		public static void getListTest() {
			
			blogDao dao = new blogDao();
			
			List<blogVo> list = dao.getList();
			
			for( blogVo vo : list) {
				System.out.println( vo );
			}
		}

}
