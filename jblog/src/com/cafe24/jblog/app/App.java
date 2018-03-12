package com.cafe24.jblog.app;

import com.cafe24.jblog.test.blogTest;
import com.cafe24.jblog.test.categoryTest;
import com.cafe24.jblog.test.commentTest;
import com.cafe24.jblog.test.postTest;
import com.cafe24.jblog.test.userTest;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("****************************");
		System.out.println("***********회원 리스트*********");
		 
		userTest.getListTest();
		
		System.out.println("");
		System.out.println("****************************");
		System.out.println("************BLOG*********");
		
		blogTest.getListTest();
		
		System.out.println("");
		System.out.println("****************************");
		System.out.println("*********카테고리  리스트*********");
		
		categoryTest.getListTest();
		
		System.out.println("");
		System.out.println("****************************");
		System.out.println("***********POST 리스트*********");
		
		postTest.getListTest();
		
		System.out.println("");
		System.out.println("****************************");
		System.out.println("***********Comment 리스트*********");
		
		commentTest.getListTest();
		
	
		
	}

}
