package com.cafe24.jblog.test;

import java.util.List;

import com.cafe24.jblog.dao.commentDao;
import com.cafe24.jblog.dao.postDao;
import com.cafe24.jblog.vo.commentVo;
import com.cafe24.jblog.vo.postVo;

public class commentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		insertTest();
		
//		getListTest();
		
		
	}
	
		public static void insertTest() {
			commentDao dao = new commentDao();
			
			commentVo vo = new commentVo();
			
			
			vo.setNo((long) 2);
			vo.setPostn((long) 2);
			vo.setContent("저도 할게 없는데요 .");
			dao.insert(vo); 

		}
		 
		public static void getListTest() {
			
			commentDao dao = new commentDao();
			
			List<commentVo> list = dao.getList();
			
			for( commentVo vo : list) {
				System.out.println( vo );
			}
		}
}
	
