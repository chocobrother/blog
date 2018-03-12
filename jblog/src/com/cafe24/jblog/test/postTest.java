package com.cafe24.jblog.test;

import java.util.List;

import com.cafe24.jblog.dao.postDao;
import com.cafe24.jblog.vo.postVo;


public class postTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		insertTest();
		
		getListTest();
		
	}
	
		public static void insertTest() {
			postDao dao = new postDao();
			
			postVo vo = new postVo();
			
			
			vo.setTitle("집에가서 뭐하지");
			vo.setPostn((long) 2);
			vo.setContent("일찍 끝났는데 할게 없다");
			vo.setPostdate("2018-03-12");
			vo.setPosttype("소소한 일상");
			dao.insert(vo); 

		}
		 
		public static void getListTest() {
			
			postDao dao = new postDao();
			
			List<postVo> list = dao.getList();
			
			for( postVo vo : list) {
				System.out.println( vo );
			}
		}
}
	
